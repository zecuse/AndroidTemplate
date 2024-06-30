package com.zecuse.template.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.zecuse.template.R

/**
 * Fonts provided by the app.
 */
object AppFonts
{
	val sourceCodePro = FontFamily(
		Font(resId = R.font.scp_regular,
		     weight = FontWeight.Normal,
		     style = FontStyle.Normal),
		Font(resId = R.font.scp_italic,
		     weight = FontWeight.Normal,
		     style = FontStyle.Italic),
		Font(resId = R.font.scp_bold,
		     weight = FontWeight.Bold,
		     style = FontStyle.Normal),
		Font(resId = R.font.scp_bold_italic,
		     weight = FontWeight.Bold,
		     style = FontStyle.Italic),
	)
}

/**
 * @suppress
 */
val defaultType = Typography(
	displayLarge = TextStyle(fontSize = 57.sp,
	                         fontFamily = FontFamily.Default,
	                         fontWeight = FontWeight.Bold,
	                         lineHeight = 64.sp),
	displayMedium = TextStyle(fontSize = 45.sp,
	                          fontFamily = FontFamily.Default,
	                          lineHeight = 52.sp),
	displaySmall = TextStyle(fontSize = 36.sp,
	                         fontFamily = FontFamily.Default,
	                         lineHeight = 44.sp),
	headlineLarge = TextStyle(fontSize = 32.sp,
	                          fontFamily = FontFamily.Default,
	                          lineHeight = 40.sp),
	headlineMedium = TextStyle(fontSize = 28.sp,
	                           fontFamily = FontFamily.Default,
	                           lineHeight = 36.sp),
	headlineSmall = TextStyle(fontSize = 24.sp,
	                          fontFamily = FontFamily.Default,
	                          fontWeight = FontWeight.SemiBold,
	                          lineHeight = 32.sp),
	titleLarge = TextStyle(fontSize = 22.sp,
	                       fontFamily = FontFamily.Default,
	                       fontWeight = FontWeight.Medium,
	                       lineHeight = 28.sp),
	titleMedium = TextStyle(fontSize = 16.sp,
	                        fontFamily = FontFamily.Default,
	                        fontWeight = FontWeight.SemiBold,
	                        lineHeight = 24.sp),
	titleSmall = TextStyle(fontSize = 14.sp,
	                       fontFamily = FontFamily.Default,
	                       fontWeight = FontWeight.SemiBold,
	                       lineHeight = 20.sp),
	bodyLarge = TextStyle(fontSize = 16.sp,
	                      fontFamily = FontFamily.Default,
	                      lineHeight = 24.sp),
	bodyMedium = TextStyle(fontSize = 14.sp,
	                       fontFamily = FontFamily.Default,
	                       lineHeight = 20.sp),
	bodySmall = TextStyle(fontSize = 12.sp,
	                      fontFamily = FontFamily.Default,
	                      lineHeight = 16.sp),
	labelLarge = TextStyle(fontSize = 14.sp,
	                       fontFamily = FontFamily.Default,
	                       lineHeight = 20.sp),
	labelMedium = TextStyle(fontSize = 12.sp,
	                        fontFamily = FontFamily.Default,
	                        fontWeight = FontWeight.Light,
	                        lineHeight = 16.sp),
	labelSmall = TextStyle(fontSize = 11.sp,
	                       fontFamily = FontFamily.Default,
	                       fontWeight = FontWeight.Bold,
	                       lineHeight = 16.sp),
)

/**
 * Changes the font family used in [base] to [fontFam]
 *
 * @param base The target typography to change.
 * @param fontFam The new font family.
 *
 * @return A copy of the [base] typography with the new [fontFam] value.
 */
fun changeFont(base: Typography, fontFam: FontFamily) =
	Typography(displayLarge = base.displayLarge.copy(fontFamily = fontFam),
	           displayMedium = base.displayMedium.copy(fontFamily = fontFam),
	           displaySmall = base.displaySmall.copy(fontFamily = fontFam),
	           headlineLarge = base.headlineLarge.copy(fontFamily = fontFam),
	           headlineMedium = base.headlineMedium.copy(fontFamily = fontFam),
	           headlineSmall = base.headlineSmall.copy(fontFamily = fontFam),
	           titleLarge = base.titleLarge.copy(fontFamily = fontFam),
	           titleMedium = base.titleMedium.copy(fontFamily = fontFam),
	           titleSmall = base.titleSmall.copy(fontFamily = fontFam),
	           bodyLarge = base.bodyLarge.copy(fontFamily = fontFam),
	           bodyMedium = base.bodyMedium.copy(fontFamily = fontFam),
	           bodySmall = base.bodySmall.copy(fontFamily = fontFam),
	           labelLarge = base.labelLarge.copy(fontFamily = fontFam),
	           labelMedium = base.labelMedium.copy(fontFamily = fontFam),
	           labelSmall = base.labelSmall.copy(fontFamily = fontFam))
