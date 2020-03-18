package com.company.gfg.strings

import java.util.*

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}

fun lengthOfLongestSubstring(s: String): Int {
    val n = s.length
    val set: MutableSet<Char> = HashSet()
    var ans = 0
    var i = 0
    var j = 0
    while (i < n && j < n) {
        if (set.contains(s[j])) {
            set.remove(s[i++])
        } else {
            set.add(s[j++])
            ans = Math.max(ans, j - i)
        }
    }
    return ans
}