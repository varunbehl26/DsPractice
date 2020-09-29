package com.company.gfg.arrays



fun main() {
    val strings = arrayOf("flower", "flow", "flight")
    print(longestCommonPrefix(strings))
}

fun longestCommonPrefix(strs: Array<String>): String? {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}