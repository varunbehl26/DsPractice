package com.company.stack

//Input: "(()())(())"
//Output: "()()()"
fun removeOuterParentheses(S: String): String {
    val s = StringBuilder()
    var opened = 0
    for (c in S.toCharArray()) {
        if (c == '(' && opened++ > 0) s.append(c)
        if (c == ')' && opened-- > 1) s.append(c)
    }
    return s.toString()
}

fun main() {
    print(removeOuterParentheses("(()())(())"))
}