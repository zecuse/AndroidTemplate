@file:Suppress("UnusedReceiverParameter",
               "SpellCheckingInspection",
               "unused")

package com.zecuse.template.ui.theme.shapes

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * Creates rectangle shapes with width [w], height [h], and optionally rounded corners with radius [r].
 *
 * [r] defaults to sharp corners resulting in normal rectangles.
 *
 * The (x, y) components of [r] should be no larger than half the [w] and [h] values, respectively.
 * This will result in the creation of elliptical shapes inscribed within the rectangle.
 *
 * Equal [w] and [h] result in squares.
 *
 * Elliptical squares result in circles.
 *
 * @param w The size of the rectangle in the x axis.
 * @param h The size of the rectangle in the y axis.
 * @param r The definition of the radii for each corner of the rectangle.
 *
 * @return The optionally rounded rectangle.
 */
class EllipseRect(
	private val w: Dp,
	private val h: Dp,
	private val r: FourCorners = FourCorners(),
): Shape
{
	override fun createOutline(
		size: Size,
		layoutDirection: LayoutDirection,
		density: Density,
	): Outline
	{
		val width = with(density) {w.toPx()}
		val height = with(density) {h.toPx()}
		val topLeft = CornerRadius(x = with(density) {r.topLeft.first.toPx()},
		                           y = with(density) {r.topLeft.second.toPx()})
		val topRight = CornerRadius(x = with(density) {r.topRight.first.toPx()},
		                            y = with(density) {r.topRight.second.toPx()})
		val bottomRight = CornerRadius(x = with(density) {r.bottomRight.first.toPx()},
		                               y = with(density) {r.bottomRight.second.toPx()})
		val bottomLeft = CornerRadius(x = with(density) {r.bottomLeft.first.toPx()},
		                              y = with(density) {r.bottomLeft.second.toPx()})
		val path = Path().apply {
			addRoundRect(RoundRect(rect = Rect(offset = Offset.Zero,
			                                   size = Size(width = width,
			                                               height = height)),
			                       topLeft = topLeft,
			                       topRight = topRight,
			                       bottomRight = bottomRight,
			                       bottomLeft = bottomLeft))
		}
		return Outline.Generic(path)
	}
}

/**
 * Defines the x and y radii used by the corners of a rectangle.
 *
 * Defaults to sharp, right angle corners.
 *
 * @param topLeft The (x, y) radii pair for the top left corner.
 * @param topRight The (x, y) radii pair for the top right corner.
 * @param bottomRight The (x, y) radii pair for the bottom right corner.
 * @param bottomLeft The (x, y) radii pair for the bottom left corner.
 */
data class FourCorners(
	val topLeft: Pair<Dp, Dp> = Pair(first = 0.dp,
	                                 second = 0.dp),
	val topRight: Pair<Dp, Dp> = Pair(first = 0.dp,
	                                  second = 0.dp),
	val bottomRight: Pair<Dp, Dp> = Pair(first = 0.dp,
	                                     second = 0.dp),
	val bottomLeft: Pair<Dp, Dp> = Pair(first = 0.dp,
	                                    second = 0.dp),
)

/**
 * Helper function to create rectangles with equal corners with different (x, y) radii.
 *
 * @param size The (width, height) of the rectangle.
 * @param corners The (x, y) radii of the corners.
 *
 * @return A rounded rectangle with equal (x, y) radii corners.
 */
fun MaterialTheme.roundrect(size: Pair<Dp, Dp>, corners: Pair<Dp, Dp>): EllipseRect
{
	return EllipseRect(w = size.first,
	                   h = size.second,
	                   r = FourCorners(topLeft = corners,
	                                   topRight = corners,
	                                   bottomRight = corners,
	                                   bottomLeft = corners))
}

/**
 * Helper function to create squares with equal corners with different (x, y) radii.
 *
 * @param size The side length of the square.
 * @param corners The (x, y) radii of the corners.
 *
 * @return A rounded square with equal (x, y) radii corners.
 */
fun MaterialTheme.roundrect(size: Dp, corners: Pair<Dp, Dp>): EllipseRect
{
	return EllipseRect(w = size,
	                   h = size,
	                   r = FourCorners(topLeft = corners,
	                                   topRight = corners,
	                                   bottomRight = corners,
	                                   bottomLeft = corners))
}

/**
 * Helper function to create rectangles with equal radii corners.
 *
 * @param size The (width, height) of the rectangle.
 * @param radius The radius of the corners.
 *
 * @return A rounded rectangle with equal radii corners.
 */
fun MaterialTheme.roundrect(size: Pair<Dp, Dp>, radius: Dp): EllipseRect
{
	return EllipseRect(w = size.first,
	                   h = size.second,
	                   r = FourCorners(topLeft = Pair(first = radius,
	                                                  second = radius),
	                                   topRight = Pair(first = radius,
	                                                   second = radius),
	                                   bottomRight = Pair(first = radius,
	                                                      second = radius),
	                                   bottomLeft = Pair(first = radius,
	                                                     second = radius)))
}

/**
 * Helper function to create squares with equal radii corners.
 *
 * @param size The side length of the square.
 * @param radius The radius of the corners.
 *
 * @return A rounded square with equal radii corners.
 */
fun MaterialTheme.roundrect(size: Dp, radius: Dp): EllipseRect
{
	return EllipseRect(w = size,
	                   h = size,
	                   r = FourCorners(topLeft = Pair(first = radius,
	                                                  second = radius),
	                                   topRight = Pair(first = radius,
	                                                   second = radius),
	                                   bottomRight = Pair(first = radius,
	                                                      second = radius),
	                                   bottomLeft = Pair(first = radius,
	                                                     second = radius)))
}

/**
 * Helper function to create rectangles with [FourCorners].
 *
 * @param size The (width, height) of the rectangle.
 * @param radii The [FourCorners] defined corners.
 *
 * @return A rounded rectangle with [FourCorners] defined corners.
 */
fun MaterialTheme.roundrect(size: Pair<Dp, Dp>, radii: FourCorners): EllipseRect
{
	return EllipseRect(w = size.first,
	                   h = size.second,
	                   r = radii)
}

/**
 * Helper function to create squares with [FourCorners].
 *
 * @param size The side length of the square.
 * @param radii The [FourCorners] defined corners.
 *
 * @return A rounded square with [FourCorners] defined corners.
 */
fun MaterialTheme.roundrect(size: Dp, radii: FourCorners): EllipseRect
{
	return EllipseRect(w = size,
	                   h = size,
	                   r = radii)
}
