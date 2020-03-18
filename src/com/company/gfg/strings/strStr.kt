package com.company.gfg.strings

fun main() {
    println(strStr("mississippi", "issipi"))
}

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) {
        return 0
    } else if (haystack.isEmpty() || haystack.length < needle.length) {
        return -1
    }
    val haystackArray = haystack.toCharArray()
    val needleArray = needle.toCharArray()
    var notFoundYet = false

    haystackArray.forEachIndexed { hayIndex, hayIndexChar ->
        if (needleArray[0] == hayIndexChar) {
            needleArray.forEachIndexed { index, needleChar ->
                if ((hayIndex + index) > haystackArray.size - 1) {
                    notFoundYet = true
                } else if (haystackArray[hayIndex + index] != needleArray[index]) {
                    notFoundYet = true
                }
            }
            if (!notFoundYet) {
                return hayIndex
            }
        }
        notFoundYet = false
    }
    return -1
}