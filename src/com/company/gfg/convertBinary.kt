package com.company.gfg

fun convertBinary(num: Int): String {
    var num = num
    var str = ""
    val binary = IntArray(10000)
    var index = 0
    while (num > 0) {
        binary[index++] = num % 2
        num /= 2
    }
    for (i in index - 1 downTo 0) {
        str = str.plus(binary[i])
    }
    return str
}