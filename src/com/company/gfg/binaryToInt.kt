package com.company.gfg

import java.math.BigDecimal

fun binaryToInt(firstArr: String): Long {
    if (firstArr.isEmpty()) {
        return BigDecimal.ZERO.toLong()
    }
    var result = 0L
    var i = 0

    val inputArray = firstArr.toCharArray()
    var j = inputArray.size - 1

    while (j >= 0) {
        val roundToInt = Math.pow(2.00, (i++).toDouble()).toLong()
        result += roundToInt * (Character.getNumericValue(inputArray[j--]).toLong())
    }

    return result
}