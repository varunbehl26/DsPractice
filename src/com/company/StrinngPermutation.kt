package com.company

fun main() {
    print(checkInclusion("ab", "eidaoobo"))
}

fun checkInclusion(s1: String, s2: String): Boolean {
    val map = HashMap<Char, Int>()
    val parent = if (s1.length > s2.length) s1 else s2
    val child = if (s1.length < s2.length) s1 else s2

    return true
}