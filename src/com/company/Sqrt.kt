package com.company

fun main() {
    print(squareRoot(5.toFloat()))
}

fun squareRoot(num: Float): Float {

    /*We are using n itself as
        initial approximation This
        can definitely be improved */
    var x = num
    var y = 1f

    // e decides the accuracy level
    val e = 0.000001
    while (x - y > e) {
        x = (x + y) / 2
        y = num / x
    }
    return x
}