package com.company.gfg.arrays


fun main() {

    print(romanToInt("III"))
}

fun romanToInt(s: String): Int {
    val charArr = s.toCharArray()
    var output = 0
    var index = 0

    while (index != charArr.size) {

        var next = 0
        if (index != charArr.size - 1) {
            next = getCharValue(charArr[index + 1])
        }
        val prev: Int = getCharValue(charArr[index])

        if (next <= prev) {
            output += prev
        } else {
            output += (next - prev)
            index++
        }
        index++
    }
    return output
}

fun getCharValue(c: Char): Int {
    when (c) {
        'I' -> {
            return 1
        }
        'V' -> {
            return 5
        }
        'X' -> {
            return 10
        }
        'L' -> {
            return 50
        }
        'C' -> {
            return 100
        }
        'D' -> {
            return 500
        }
        'M' -> {
            return 1000
        }
    }
    return 0
}
