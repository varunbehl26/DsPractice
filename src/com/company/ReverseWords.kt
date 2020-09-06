package com.company

fun main() {
    print(reverseWords("a good   example"))
}

fun reverseWords(s: String): String {
    val stringArr = s.split(" ")
    var output = ""
    for (i in stringArr.lastIndex downTo 0) {
        if (stringArr[i].isNotBlank())
            output += stringArr[i] + " "
    }
    return output.trim()
}