package com.zecuse.template.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf

/**
 * Names for some common fractions between 0 and 1.
 *
 * Ratios for tenths, fourths, thirds, and half are defined.
 * Values for tenths take the form: Latin/Greek prefix + "enth".
 */
@Suppress("SpellCheckingInspection")
data class Ratio(
	val tenth: Float = 0.1f,
	val fifth: Float = 0.2f,
	val quarter: Float = 0.25f,
	val trenth: Float = 0.3f,
	val third: Float = 0.33f,
	val tetrenth: Float = 0.4f,
	val half: Float = 0.5f,
	val hexenth: Float = 0.6f,
	val twothirds: Float = 0.66f,
	val septenth: Float = 0.7f,
	val triquarts: Float = 0.75f,
	val octenth: Float = 0.8f,
	val nonenth: Float = 0.9f,
)

/**
 * @suppress
 */
val LocalRatio = compositionLocalOf {Ratio()}

/**
 * @suppress
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.ratio: Ratio
	@Composable @ReadOnlyComposable get() = LocalRatio.current