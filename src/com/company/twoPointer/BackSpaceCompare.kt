package com.company.twoPointer

fun main() {
    println(backspaceCompare("a##c", "#a#c"))
}

fun backspaceCompare(S: String, T: String): Boolean {
    var sLastIndex = S.length - 1
    var tLastIndex = T.length - 1
    var skipS = 0
    var skipT = 0

    // While there may be chars in build(S) or build (T)
    // Find position of next possible char in build(S)
    while (sLastIndex >= 0 || tLastIndex >= 0) {

        while (sLastIndex >= 0) {
            if (S[sLastIndex] == '#') {
                skipS++
                sLastIndex--
            } else if (skipS > 0) {
                skipS--
                sLastIndex--
            } else {
                break
            }
        }
        while (tLastIndex >= 0) {
            // Find position of next possible char in build(T)
            if (T[tLastIndex] == '#') {
                skipT++
                tLastIndex--
            } else if (skipT > 0) {
                skipT--
                tLastIndex--
            } else {
                break
            }
        }
        // If two actual characters are different
        if (sLastIndex >= 0 && tLastIndex >= 0 && S[sLastIndex] != T[tLastIndex]) {
            return false
        }
        // If expecting to compare char vs nothing
        if (sLastIndex >= 0 != tLastIndex >= 0) {
            return false
        }
        sLastIndex--
        tLastIndex--
    }
    return true
}