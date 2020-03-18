package com.company.gfg.binary

fun main() {
//    println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"))
    println(addBinary("1111", "1111"))
}

fun addBinary(a: String, b: String): String {
    if (a.isEmpty()) {
        return b
    } else if (b.isEmpty()) {
        return a
    }
    val aArr = a.toCharArray()
    val bArr = b.toCharArray()
    var totalSum = ""
    var rem = 0
    var aIndex = aArr.size - 1
    var bIndex = bArr.size - 1


    while (aIndex >= 0 && bIndex >= 0) {
        var sum = Character.getNumericValue(aArr[aIndex]) + Character.getNumericValue(bArr[bIndex]) + rem
        when (sum) {
            3 -> {
                sum = 1
                rem = 1
            }
            2 -> {
                sum = 0
                rem = 1
            }
            else -> {
                rem = 0
            }
        }
        totalSum = totalSum.plus(sum)
        aIndex--
        bIndex--
    }

    while (aIndex >= 0) {
        var sum = Character.getNumericValue(aArr[aIndex]) + rem
        if (sum == 2) {
            sum = 0
            rem = 1
        } else {
            rem = 0
        }
        totalSum = totalSum.plus(sum)
        aIndex--
    }
    while (bIndex >= 0) {
        var sum = Character.getNumericValue(bArr[bIndex]) + rem
        if (sum == 2) {
            sum = 0
            rem = 1
        } else {
            rem = 0
        }
        totalSum = totalSum.plus(sum)
        bIndex--
    }
//    if (rem!=0){
//        totalSum= totalSum.plus(rem)
//    }
    return totalSum.reversed()

}




