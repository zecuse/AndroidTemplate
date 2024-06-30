package com.zecuse.template.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Every color defined for the app.
 *
 * 5 saturated colors transitioning 1/4 between each RGB pair value.
 *
 * RGB example:
 * ```
 * 1,    0, 0 = 0xff0000 = Red
 * 1, 0.25, 0 = 0xfff400 = Tangelo
 * 1,  0.5, 0 = 0xfff800 = Orange
 * 1, 0.75, 0 = 0xfffc00 = Amber
 * ```
 *
 * 7 grey scale colors.
 *
 * 3 40% saturated colors transitioning 1/2 between each RGB pair value.
 *
 * RGB example:
 * ```
 * 1,    0, 0 = 0xff0000 = Red
 * 1,  0.5, 0 = 0xfff800 = Orange
 * ```
 */
object AllColors
{
	val Red15 = Color(0xff4d0000)
	val Red35 = Color(0xffb30000)
	val Red50 = Color(0xffff0000)
	val Red70 = Color(0xffff6666)
	val Red90 = Color(0xffffcccc)
	val Tangelo15 = Color(0xff4d1300)
	val Tangelo35 = Color(0xffb32d00)
	val Tangelo50 = Color(0xffff4000)
	val Tangelo70 = Color(0xffff8c66)
	val Tangelo90 = Color(0xffffd9cc)
	val Orange15 = Color(0xff4d2600)
	val Orange35 = Color(0xffb35900)
	val Orange50 = Color(0xffff8000)
	val Orange70 = Color(0xffffb366)
	val Orange90 = Color(0xffffe6cc)
	val Amber15 = Color(0xff4d3900)
	val Amber35 = Color(0xffb38600)
	val Amber50 = Color(0xffffc000)
	val Amber70 = Color(0xffffd966)
	val Amber90 = Color(0xfffff2cc)
	val Yellow15 = Color(0xff4d4d00)
	val Yellow35 = Color(0xffb3b300)
	val Yellow50 = Color(0xffffff00)
	val Yellow70 = Color(0xffffff66)
	val Yellow90 = Color(0xffffffcc)
	val Lime15 = Color(0xff394d00)
	val Lime35 = Color(0xff86b300)
	val Lime50 = Color(0xffc0ff00)
	val Lime70 = Color(0xffd9ff66)
	val Lime90 = Color(0xfff2ffcc)
	val Chartreuse15 = Color(0xff264d00)
	val Chartreuse35 = Color(0xff59b300)
	val Chartreuse50 = Color(0xff80ff00)
	val Chartreuse70 = Color(0xffb3ff66)
	val Chartreuse90 = Color(0xffe6ffcc)
	val Harlequin15 = Color(0xff134d00)
	val Harlequin35 = Color(0xff2db300)
	val Harlequin50 = Color(0xff40ff00)
	val Harlequin70 = Color(0xff8cff66)
	val Harlequin90 = Color(0xffd9ffcc)
	val Green15 = Color(0xff004d00)
	val Green35 = Color(0xff00b300)
	val Green50 = Color(0xff00ff00)
	val Green70 = Color(0xff66ff66)
	val Green90 = Color(0xffccffcc)
	val Erin15 = Color(0xff004d13)
	val Erin35 = Color(0xff00b32d)
	val Erin50 = Color(0xff00ff40)
	val Erin70 = Color(0xff66ff8c)
	val Erin90 = Color(0xffccffd9)
	val Spring15 = Color(0xff004d26)
	val Spring35 = Color(0xff00b359)
	val Spring50 = Color(0xff00ff80)
	val Spring70 = Color(0xff66ffb3)
	val Spring90 = Color(0xffccffe6)
	val Aquamarine15 = Color(0xff004d39)
	val Aquamarine35 = Color(0xff00b386)
	val Aquamarine50 = Color(0xff00ffc0)
	val Aquamarine70 = Color(0xff66ffd9)
	val Aquamarine90 = Color(0xffccfff2)
	val Cyan15 = Color(0xff004d4d)
	val Cyan35 = Color(0xff00b3b3)
	val Cyan50 = Color(0xff00ffff)
	val Cyan70 = Color(0xff66ffff)
	val Cyan90 = Color(0xffccffff)
	val Sky15 = Color(0xff00394d)
	val Sky35 = Color(0xff0086b3)
	val Sky50 = Color(0xff00c0ff)
	val Sky70 = Color(0xff66d9ff)
	val Sky90 = Color(0xffccf2ff)
	val Azure15 = Color(0xff00264d)
	val Azure35 = Color(0xff0059b3)
	val Azure50 = Color(0xff0080ff)
	val Azure70 = Color(0xff66b3ff)
	val Azure90 = Color(0xffcce6ff)
	val Persian15 = Color(0xff00134d)
	val Persian35 = Color(0xff002db3)
	val Persian50 = Color(0xff0040ff)
	val Persian70 = Color(0xff668cff)
	val Persian90 = Color(0xffccd9ff)
	val Blue15 = Color(0xff00004d)
	val Blue35 = Color(0xff0000b3)
	val Blue50 = Color(0xff0000ff)
	val Blue70 = Color(0xff6666ff)
	val Blue90 = Color(0xffccccff)
	val Indigo15 = Color(0xff13004d)
	val Indigo35 = Color(0xff2d00b3)
	val Indigo50 = Color(0xff4000ff)
	val Indigo70 = Color(0xff8c66ff)
	val Indigo90 = Color(0xffd9ccff)
	val Violet15 = Color(0xff26004d)
	val Violet35 = Color(0xff5900b3)
	val Violet50 = Color(0xff8000ff)
	val Violet70 = Color(0xffb366ff)
	val Violet90 = Color(0xffe6ccff)
	val Purple15 = Color(0xff39004d)
	val Purple35 = Color(0xff8600b3)
	val Purple50 = Color(0xffc000ff)
	val Purple70 = Color(0xffd966ff)
	val Purple90 = Color(0xfff2ccff)
	val Fuchsia15 = Color(0xff4d004d)
	val Fuchsia35 = Color(0xffb300b3)
	val Fuchsia50 = Color(0xffff00ff)
	val Fuchsia70 = Color(0xffff66ff)
	val Fuchsia90 = Color(0xffffccff)
	val Magenta15 = Color(0xff4d0039)
	val Magenta35 = Color(0xffb30086)
	val Magenta50 = Color(0xffff00c0)
	val Magenta70 = Color(0xffff66d9)
	val Magenta90 = Color(0xffffccf2)
	val Rose15 = Color(0xff4d0026)
	val Rose35 = Color(0xffb30059)
	val Rose50 = Color(0xffff0080)
	val Rose70 = Color(0xffff66b3)
	val Rose90 = Color(0xffffcce6)
	val Folly15 = Color(0xff4d0013)
	val Folly35 = Color(0xffb3002d)
	val Folly50 = Color(0xffff0040)
	val Folly70 = Color(0xffff668c)
	val Folly90 = Color(0xffffccd9)

	val Black = Color(0xff000000)
	val Grey15 = Color(0xff262626)
	val Grey35 = Color(0xff595959)
	val Grey50 = Color(0xff808080)
	val Grey70 = Color(0xffb3b3b3)
	val Grey90 = Color(0xffe6e6e6)
	val White = Color(0xffffffff)

	val RedGrey35 = Color(0xff7d3636)
	val RedGrey50 = Color(0xffb34d4d)
	val RedGrey65 = Color(0xffc98282)
	val OrangeGrey35 = Color(0xff7d5936)
	val OrangeGrey50 = Color(0xffb3804d)
	val OrangeGrey65 = Color(0xffc9a682)
	val YellowGrey35 = Color(0xff7d7d36)
	val YellowGrey50 = Color(0xffb3b34d)
	val YellowGrey65 = Color(0xffc9c982)
	val ChartreuseGrey35 = Color(0xff597d36)
	val ChartreuseGrey50 = Color(0xff80b34d)
	val ChartreuseGrey65 = Color(0xffa6c982)
	val GreenGrey35 = Color(0xff367d36)
	val GreenGrey50 = Color(0xff4db34d)
	val GreenGrey65 = Color(0xff82c982)
	val SpringGrey35 = Color(0xff367d59)
	val SpringGrey50 = Color(0xff4db380)
	val SpringGrey65 = Color(0xff82c9a6)
	val CyanGrey35 = Color(0xff367d7d)
	val CyanGrey50 = Color(0xff4db3b3)
	val CyanGrey65 = Color(0xff82c9c9)
	val AzureGrey35 = Color(0xff36597d)
	val AzureGrey50 = Color(0xff4d80b3)
	val AzureGrey65 = Color(0xff82a6c9)
	val BlueGrey35 = Color(0xff36367d)
	val BlueGrey50 = Color(0xff4d4db3)
	val BlueGrey65 = Color(0xff8282c9)
	val VioletGrey35 = Color(0xff59367d)
	val VioletGrey50 = Color(0xff804db3)
	val VioletGrey65 = Color(0xffa682c9)
	val FuchsiaGrey35 = Color(0xff7d367d)
	val FuchsiaGrey50 = Color(0xffb34db3)
	val FuchsiaGrey65 = Color(0xffc982c9)
	val RoseGrey35 = Color(0xff7d3659)
	val RoseGrey50 = Color(0xffb34d80)
	val RoseGrey65 = Color(0xffc982a6)
}

/**
 * Used for easily accessing black and white colors when contrast matters.
 */
data class TextContrast(
	val high: Color = Color.Unspecified,
	val med: Color = Color.Unspecified,
	val low: Color = Color.Unspecified,
)

/**
 * @suppress
 */
val LocalTextContrast = compositionLocalOf {TextContrast()}

/**
 * @suppress
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.contrast: TextContrast
	@Composable @ReadOnlyComposable get() = LocalTextContrast.current
