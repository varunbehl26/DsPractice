package com.company.gfg.strings

import java.util.*


//TODO
fun main() {
    val list = findAnagrams("abab", "ab")
//    val list = findAnagrams("baa", "aa")
    list?.forEach {
        println(it)
    }
}

//fun findAnagrams(s: String, p: String): List<Int> {
//    val list = mutableListOf<Int>()
//    val pCharArr = p.toCharArray()
//    var startIndex = 0
//    val pLen = p.length
//    var notFound = false
//    val map = HashMap<Char, Int>()
//    pCharArr.forEach {
//        map[it] = 1
//    }
//
//    while ((pLen + startIndex) <= s.length) {
//        val str = s.substring(startIndex, pLen + startIndex)
//        map.forEach { (char, value) ->
//            if (!str.contains(char)) {
//                map[char] = 0
//            }
//        }
//        map.forEach { (char, value) ->
//            if (value == 0) {
//                notFound = true
//            }
//        }
//        pCharArr.forEach {
//            map[it] = 1
//        }
//
//        if (!notFound) {
//            list.add(startIndex)
//        }
//        startIndex++
//
//        notFound = false
//    }
//
//    return list
//}

//fun findAnagrams(students: String, plans: String): List<Int>? { // that's impossible to match perfectly
//    if (students.length < plans.length) return emptyList()
//    // 26 difference jobs: static need, and dynamic hire
//    val need = IntArray(26)
//    val hire = IntArray(26)
//    for (plan in plans.toCharArray()) hire[plan - 'a'] = ++need[plan - 'a'] // initial
//    // how many we need in total, and how many we expected right now
//    val needCnt = plans.length
//    var expected = needCnt
//    val coders = students.toCharArray() // well..we're coders
//    // the perfect match solutions
//    val perfect: MutableList<Int> = LinkedList()
//    for (i in coders.indices) {
//        if (i - needCnt >= 0) {
//            val leaving = coders[i - needCnt] // who's leaving
//            hire[leaving - 'a']++ // the job need more
//            if (need[leaving - 'a'] > 0 && hire[leaving - 'a'] > 0) expected++
//        }
//        val hiring = coders[i] // who's coming
//        if (need[hiring - 'a'] > 0 && hire[hiring - 'a'] > 0) expected--
//        hire[hiring - 'a']-- // the job need less
//        if (expected == 0) perfect.add(i - needCnt + 1) // perfect match
//    }
//    return perfect
//}

fun findAnagrams(s: String, p: String): List<Int>? {
    val map: MutableMap<Char, Int> = HashMap()
    val list: MutableList<Int> = ArrayList()

    if (s.length < p.length) return list

    for (c in p.toCharArray()) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    var l = 0
    var startIndex = 0

    while (startIndex < s.length) {
        val i = map.getOrDefault(s[startIndex], 0) - 1
        if (i == 0) {
            map.remove(s[startIndex])
        } else {
            map[s[startIndex]] = i
        }
        startIndex++
        if (startIndex - l > p.length) {
            val k = map.getOrDefault(s[l], 0) + 1
            if (k == 0) map.remove(s[l]) else map[s[l]] = k
            l++
        }
        if (map.isEmpty()) {
            list.add(l)
        }
    }
    return list
}