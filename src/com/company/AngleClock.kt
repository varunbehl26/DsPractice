package com.company

import kotlin.math.absoluteValue

fun main() {
    print(angleClock(1, 57))
}

fun angleClock(hour: Int, minutes: Int): Double {
    val anglePerMin = 6
    val anglePerHour = 30
    var innerHour = hour

    if (innerHour == 12) {
        innerHour = 0
    }

    val hourAngle = (innerHour) * anglePerHour + 0.5 * minutes

    val minAngle = minutes * anglePerMin

    val absoluteValue = (hourAngle - minAngle).absoluteValue
    if (absoluteValue > 180) {
        return 360 - absoluteValue
    }
    return absoluteValue
}

