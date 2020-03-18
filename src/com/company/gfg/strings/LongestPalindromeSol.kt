package com.company.gfg.strings

//https://www.youtube.com/watch?v=nbTSfrEfo6M

fun main() {
    longestPalindrome("babad")
}

private fun longestPalindrome(str: String): String {
    var result = ""

    val values = str.toCharArray()
    var maxLength = 0
    for (i in values.indices) {
        for (j in i until values.size + 1) {
            val substring = str.substring(i, j)
            val stringBuilder = StringBuilder(substring)
            stringBuilder.reverse()
            if (substring == stringBuilder.toString()) {
                if (substring.length > maxLength) {
                    maxLength = substring.length
                    result = substring
                }
            }
        }
    }
    return result
}




