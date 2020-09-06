package com.company

import java.util.*
import kotlin.math.pow


fun main() {

    print(findJudge(3, arrayOf(
            intArrayOf(1, 3)
            , intArrayOf(2, 3)
            , intArrayOf(3, 1)
    )))
}

fun findJudge(N: Int, trust: Array<IntArray>): Int {
    val count = IntArray(N + 1)

    trust.forEach {
        count[it[0]]--
        count[it[1]]++
    }

    for (i in 1..N) {
        if (count[i] == N - 1) {
            return i
        }
    }

    return -1

}



fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    val m = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]).toFloat()

    for (i in 1 until coordinates.size - 1) {
        val slope = (coordinates[i + 1][1] - coordinates[i][1]) / (coordinates[i + 1][0] - coordinates[i][0]).toFloat()
        if (m != slope) {
            return false
        }
    }

    return true

}


fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    nums.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
        if (map[it]!! > nums.size / 2) {
            return it
        }
    }
    return -1
}

fun bitwiseComplement(N: Int): Int {
    var X = 1
    while (N > X) X = X * 2 + 1
    return X - N
}

fun findComplement(N: Int): Int {
    var localNum: Int = N
    var outputValue = "";
    var complementOutput = "";
    while (localNum > 0) {
        val output = localNum % 2
        outputValue = outputValue.plus(output)
        localNum /= 2
    }
    for (c in outputValue) {
        complementOutput = complementOutput.plus(if (c == '0') {
            '1'
        } else '0')
    }
    var result = 0;
    for ((index, c) in complementOutput.withIndex()) {
        val parseInt = Integer.parseInt(c.toString())
        result += 2.toDouble().pow(index.toDouble()).toInt() * parseInt
    }
    return result
}


fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magazineCharArr = magazine.toCharArray()

    ransomNote.forEachIndexed { index, c ->
        val indexOf = magazineCharArr.indexOf(c)
        if (indexOf != -1) {
            magazineCharArr[indexOf] = '.';
        } else {
            return false
        }
    }

    return true

}


fun calendar() {
    val newCalendar: Calendar = Calendar.getInstance()
    newCalendar.set(Calendar.DATE, 21)
    newCalendar.set(Calendar.MONTH, 2)
    newCalendar.set(Calendar.YEAR, 2020)
    newCalendar.set(Calendar.HOUR_OF_DAY, 12)
    newCalendar.set(Calendar.MINUTE, 0)
    newCalendar.set(Calendar.SECOND, 20)

    val currentTime = Calendar.getInstance().time

    val givenTime = newCalendar.time

    val diff = currentTime.time.minus(givenTime.time) / 1000

    val days = diff / (60 * 60 * 24)
    val hours = (diff - (days * (60 * 60 * 24))) / (60 * 60)
    val min = (diff - ((days * 60 * 60 * 24) + (hours * 60 * 60))) / 60

    println(days)
    println(hours)
    println(min)
}
