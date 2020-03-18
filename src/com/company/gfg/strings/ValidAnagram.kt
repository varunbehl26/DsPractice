package com.company.gfg.strings

fun main() {
    println(isAnagram("a", "ab"))
}

fun isAnagram(s: String, t: String): Boolean {
    val sArr = s.toCharArray()
    val tArr = t.toCharArray()
    val map = HashMap<Char, Int>()
    sArr.forEach {
        if (map.containsKey(it)) {
            val value = map[it]
            val value1 = value?.plus(1)
            map[it] = value1!!
        } else {
            map[it] = 1
        }
    }
    tArr.forEach {
        if (map.containsKey(it)) {
            val value = map[it]
            if (value == 1) {
                map.remove(it)
            } else {
                val value1 = value?.minus(1)
                map[it] = value1!!
            }
        } else {
            return false
        }
    }

    if (map.isEmpty()) {
        return true
    }

    return false
}