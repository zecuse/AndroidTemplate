package com.zecuse.template.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.font.FontFamily
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.zecuse.template.database.SettingsDao
import com.zecuse.template.database.SettingsDatabase
import com.zecuse.template.model.SettingsData
import com.zecuse.template.model.SettingsState
import com.zecuse.template.ui.theme.AppFonts
import com.zecuse.template.ui.theme.AppColor
import com.zecuse.template.ui.theme.AppTheme
import com.zecuse.template.ui.theme.changeFont
import com.zecuse.template.ui.theme.defaultType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class SettingsViewModel(private val dao: SettingsDao): ViewModel()
{
	val state = mutableStateOf(SettingsState())

	init
	{
		viewModelScope.launch {
			val settings = dao.getSettings()
				               .first() ?: SettingsData()
			state.apply {
				val spacing = settings.spacing
				val typography = when (spacing)
				{
					"mono" -> changeFont(base = state.value.typography,
					                     fontFam = AppFonts.sourceCodePro)
					else   -> defaultType
				}
				this.value = this.value.copy(theme = settings.theme,
				                             color = settings.color,
				                             spacing = spacing,
				                             typography = typography)
			}
		}
	}

	fun onEvent(event: SettingsEvent)
	{
		when (event)
		{
			is SettingsEvent.SetColor      ->
			{
				viewModelScope.launch {
					var settings = dao.getSettings()
						               .first() ?: SettingsData()
					settings = settings.copy(color = event.color)
					dao.updateSetting(settings)
					state.apply {this.value = this.value.copy(color = event.color)}
				}
			}
			is SettingsEvent.SetSpacing    ->
			{
				viewModelScope.launch {
					var settings = dao.getSettings()
						               .first() ?: SettingsData()
					settings = settings.copy(spacing = event.spacing)
					dao.updateSetting(settings)
					state.apply {
						val spacing = event.spacing
						val font =
							if (spacing == "mono") AppFonts.sourceCodePro else FontFamily.Default
						val typography = changeFont(base = state.value.typography,
						                            fontFam = font)
						this.value = this.value.copy(spacing = spacing,
						                             typography = typography)
					}
				}
			}
			is SettingsEvent.SetTheme      ->
			{
				viewModelScope.launch {
					var settings = dao.getSettings()
						               .first() ?: SettingsData()
					settings = settings.copy(theme = event.theme)
					dao.updateSetting(settings)
					state.apply {this.value = this.value.copy(theme = event.theme)}
				}
			}
		}
	}
}

class SettingsFactory(
	private val db: SettingsDatabase,
): ViewModelProvider.Factory
{
	@Suppress("UNCHECKED_CAST")
	override fun <T: ViewModel> create(modelClass: Class<T>): T
	{
		return SettingsViewModel(db.dao) as T
	}
}

/**
 * This exists for preview and testing purposes.
 *
 * Previews only need this to satisfy the [SettingsViewModel] parameter. It does nothing.
 *
 * Tests use this as a makeshift database.
 */
class FakeDao: SettingsDao
{
	private var fakeSettings = HashMap<String, Any>()

	init
	{
		fakeSettings["theme"] = AppTheme.Light
		fakeSettings["color"] = AppColor.Magenta
		fakeSettings["leftHanded"] = false
		fakeSettings["spacing"] = "default"
	}

	override suspend fun updateSetting(settings: SettingsData)
	{
		fakeSettings["theme"] = settings.theme
		fakeSettings["color"] = settings.color
		fakeSettings["spacing"] = settings.spacing
	}

	override fun getSettings(): Flow<SettingsData?>
	{
		return MutableStateFlow(SettingsData(theme = fakeSettings["theme"] as AppTheme,
		                                     color = fakeSettings["color"] as AppColor,
		                                     spacing = fakeSettings["spacing"] as String))
	}
}