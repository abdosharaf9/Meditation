package com.abdosharaf.meditation.utils

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        x1 = from.x,
        y1 = from.y,
        x2 = abs(from.x + to.x) / 2f,
        y2 = abs(from.y + to.y) / 2f,
    )
}