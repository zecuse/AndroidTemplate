package com.zecuse.template.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import com.zecuse.template.model.SettingsState

/**
 * Selects 1 of 12 [ColorSchemes].
 *
 * These are a subset of the colors defined in [AllColors].
 */
enum class AppColor
{
	Red, Orange, Yellow, Lime, Green, Spring, Cyan, Sky, Blue, Violet, Purple, Magenta
}

/**
 * Determines if the app is displayed in a light or dark theme or handled by the device.
 *
 * Devices supporting dynamic theming will ignore the [AppColor] value.
 */
enum class AppTheme
{
	Auto, Dark, Light
}

/**
 * Defines a [ColorScheme] for each of the [AppColor] values for the [AppTheme.Light] and [AppTheme.Dark] themes.
 */
object ColorSchemes
{
	private fun baseDarkColors(): ColorScheme
	{
		return darkColorScheme(background = AllColors.Grey15)
	}

	private fun baseLightColors(): ColorScheme
	{
		return lightColorScheme(background = AllColors.Grey90)
	}

	val DarkRedColorScheme = baseDarkColors().copy(primary = AllColors.Red70,
	                                               onPrimary = AllColors.Folly15)
	val DarkOrangeColorScheme = baseDarkColors().copy(primary = AllColors.Tangelo70,
	                                                  onPrimary = AllColors.Orange15)
	val DarkYellowColorScheme = baseDarkColors().copy(primary = AllColors.Amber70,
	                                                  onPrimary = AllColors.Yellow15)
	val DarkLimeColorScheme = baseDarkColors().copy(primary = AllColors.Chartreuse70,
	                                                onPrimary = AllColors.Lime15)
	val DarkGreenColorScheme = baseDarkColors().copy(primary = AllColors.Green70,
	                                                 onPrimary = AllColors.Harlequin15)
	val DarkSpringColorScheme = baseDarkColors().copy(primary = AllColors.Spring70,
	                                                  onPrimary = AllColors.Erin15)
	val DarkCyanColorScheme = baseDarkColors().copy(primary = AllColors.Aquamarine70,
	                                                onPrimary = AllColors.Cyan15)
	val DarkSkyColorScheme = baseDarkColors().copy(primary = AllColors.Azure70,
	                                               onPrimary = AllColors.Sky15)
	val DarkBlueColorScheme = baseDarkColors().copy(primary = AllColors.Blue70,
	                                                onPrimary = AllColors.Persian15)
	val DarkVioletColorScheme = baseDarkColors().copy(primary = AllColors.Indigo70,
	                                                  onPrimary = AllColors.Violet15)
	val DarkPurpleColorScheme = baseDarkColors().copy(primary = AllColors.Purple70,
	                                                  onPrimary = AllColors.Fuchsia15)
	val DarkMagentaColorScheme = baseDarkColors().copy(primary = AllColors.Magenta70,
	                                                   onPrimary = AllColors.Rose15)

	val LightRedColorScheme = baseLightColors().copy(primary = AllColors.Red15,
	                                                 onPrimary = AllColors.Folly70)
	val LightOrangeColorScheme = baseLightColors().copy(primary = AllColors.Tangelo15,
	                                                    onPrimary = AllColors.Orange70)
	val LightYellowColorScheme = baseLightColors().copy(primary = AllColors.Amber15,
	                                                    onPrimary = AllColors.Yellow70)
	val LightLimeColorScheme = baseLightColors().copy(primary = AllColors.Chartreuse15,
	                                                  onPrimary = AllColors.Lime70)
	val LightGreenColorScheme = baseLightColors().copy(primary = AllColors.Green15,
	                                                   onPrimary = AllColors.Harlequin70)
	val LightSpringColorScheme = baseLightColors().copy(primary = AllColors.Spring15,
	                                                    onPrimary = AllColors.Erin70)
	val LightCyanColorScheme = baseLightColors().copy(primary = AllColors.Aquamarine15,
	                                                  onPrimary = AllColors.Cyan70)
	val LightSkyColorScheme = baseLightColors().copy(primary = AllColors.Azure15,
	                                                 onPrimary = AllColors.Sky70)
	val LightBlueColorScheme = baseLightColors().copy(primary = AllColors.Blue15,
	                                                  onPrimary = AllColors.Persian70)
	val LightVioletColorScheme = baseLightColors().copy(primary = AllColors.Indigo15,
	                                                    onPrimary = AllColors.Violet70)
	val LightPurpleColorScheme = baseLightColors().copy(primary = AllColors.Purple15,
	                                                    onPrimary = AllColors.Fuchsia70)
	val LightMagentaColorScheme = baseLightColors().copy(primary = AllColors.Magenta15,
	                                                     onPrimary = AllColors.Rose70)
}

@Composable
fun TimepiecesTheme(settings: SettingsState = SettingsState(),
                    content: @Composable () -> Unit)
{
	val dynamicAvailable = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
	val dynamicTheme = dynamicAvailable && settings.theme == AppTheme.Auto
	val darkTheme =
		(settings.theme == AppTheme.Auto && isSystemInDarkTheme()) || settings.theme == AppTheme.Dark
	val colorScheme = when
	{
		dynamicTheme && darkTheme                       -> dynamicDarkColorScheme(LocalContext.current)
		dynamicTheme && !darkTheme                      -> dynamicLightColorScheme(LocalContext.current)
		darkTheme && settings.color == AppColor.Red     -> ColorSchemes.DarkRedColorScheme
		darkTheme && settings.color == AppColor.Orange  -> ColorSchemes.DarkOrangeColorScheme
		darkTheme && settings.color == AppColor.Yellow  -> ColorSchemes.DarkYellowColorScheme
		darkTheme && settings.color == AppColor.Lime    -> ColorSchemes.DarkLimeColorScheme
		darkTheme && settings.color == AppColor.Green   -> ColorSchemes.DarkGreenColorScheme
		darkTheme && settings.color == AppColor.Spring  -> ColorSchemes.DarkSpringColorScheme
		darkTheme && settings.color == AppColor.Cyan    -> ColorSchemes.DarkCyanColorScheme
		darkTheme && settings.color == AppColor.Sky     -> ColorSchemes.DarkSkyColorScheme
		darkTheme && settings.color == AppColor.Blue    -> ColorSchemes.DarkBlueColorScheme
		darkTheme && settings.color == AppColor.Violet  -> ColorSchemes.DarkVioletColorScheme
		darkTheme && settings.color == AppColor.Purple  -> ColorSchemes.DarkPurpleColorScheme
		darkTheme && settings.color == AppColor.Magenta -> ColorSchemes.DarkMagentaColorScheme
		!darkTheme && settings.color == AppColor.Red    -> ColorSchemes.LightRedColorScheme
		!darkTheme && settings.color == AppColor.Orange -> ColorSchemes.LightOrangeColorScheme
		!darkTheme && settings.color == AppColor.Yellow -> ColorSchemes.LightYellowColorScheme
		!darkTheme && settings.color == AppColor.Lime   -> ColorSchemes.LightLimeColorScheme
		!darkTheme && settings.color == AppColor.Green  -> ColorSchemes.LightGreenColorScheme
		!darkTheme && settings.color == AppColor.Spring -> ColorSchemes.LightSpringColorScheme
		!darkTheme && settings.color == AppColor.Cyan   -> ColorSchemes.LightCyanColorScheme
		!darkTheme && settings.color == AppColor.Sky    -> ColorSchemes.LightSkyColorScheme
		!darkTheme && settings.color == AppColor.Blue   -> ColorSchemes.LightBlueColorScheme
		!darkTheme && settings.color == AppColor.Violet -> ColorSchemes.LightVioletColorScheme
		!darkTheme && settings.color == AppColor.Purple -> ColorSchemes.LightPurpleColorScheme
		else                                            -> ColorSchemes.LightMagentaColorScheme
	}
	val contrastColors = when
	{
		settings.theme == AppTheme.Auto && isSystemInDarkTheme() -> TextContrast(high = AllColors.White,
		                                                                         med = AllColors.Grey90,
		                                                                         low = AllColors.Grey70)
		settings.theme == AppTheme.Dark                          -> TextContrast(high = AllColors.White,
		                                                                         med = AllColors.Grey90,
		                                                                         low = AllColors.Grey70)
		else                                                     -> TextContrast(high = AllColors.Black,
		                                                                         med = AllColors.Grey15,
		                                                                         low = AllColors.Grey35)
	}

	CompositionLocalProvider(LocalTextContrast provides contrastColors) {
		MaterialTheme(colorScheme = colorScheme,
		              typography = settings.typography,
		              content = content)
	}
}