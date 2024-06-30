package com.zecuse.template.model

import androidx.compose.material3.Typography
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zecuse.template.database.SettingsDatabase
import com.zecuse.template.ui.theme.defaultType
import com.zecuse.template.ui.theme.AppColor
import com.zecuse.template.ui.theme.AppTheme
import com.zecuse.template.viewmodel.SettingsViewModel

/**
 * The backing state of the [SettingsViewModel]
 *
 * @param theme The current theme of the app. See [AppTheme] for valid values.
 * @param color The current color of the app. See [AppColor] for valid values.
 * @param spacing Whether the text of the app is in monospace or the device's system font.
 * @param typography The current Typography used in the app.
 */
data class SettingsState(val theme: AppTheme = AppTheme.Dark,
                         val color: AppColor = AppColor.Green,
                         val spacing: String = "mono",
                         val typography: Typography = defaultType)

/**
 * The subset of [SettingsState] values to be saved to the [SettingsDatabase].
 */
@Entity
data class SettingsData(val theme: AppTheme = AppTheme.Dark,
                        val color: AppColor = AppColor.Green,
                        val spacing: String = "mono",
                        @PrimaryKey(autoGenerate = true)
                        val id: Int = 0)