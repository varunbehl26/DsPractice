package com.company.gfg.strings

fun main() {
    println(firstUniqChar("loveleetcode"))
}

fun firstUniqChar(s: String): Int {
    if (s.isEmpty()) {
        return -1
    }
    val map = HashMap<Char, Int?>()
    val charArr = s.toCharArray()
    charArr.forEach {
        if (map.containsKey(it)) {
            val value = map[it]
            map[it] = value?.plus(1)
        } else {
            map[it] = 1
        }
    }
    charArr.forEach {
        if (map[it] == 1) {
            return s.indexOf(it)
        }
    }

    return -1
}