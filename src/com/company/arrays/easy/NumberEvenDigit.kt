package com.company.arrays


/*
    Convert number to string, check its length
 */
fun findNumbersStringMethod(nums: IntArray): Int {
    var count = 0
    nums.forEach {
        if (it.toString().length % 2 == 0) {
            count++
        }
    }
    return count
}

/*
    Use divide operation to calculate the length
 */

fun findNumbers(nums: IntArray): Int {
    var sol = 0 // Solution variable initialised to 0
    for (n in nums)  // Iterate over each number
        if (getNumberOfDigits(n) % 2 == 0) // Call getNumberOfDigits which return the total number of digits in the number
            sol++ // if even number of digits are returned we increment sol by 1
    return sol
}

fun getNumberOfDigits(num: Int): Int {
    var count = 1 // Initialise count to 1, not 0 cause we are dividing num/10 in while loop

    while ((num / 10) != 0) { // Iterate until number is 0
        count++ // Increment count until number is 0
    }
    return count
}


fun main() {
    print(findNumbers(intArrayOf(555, 901, 482, 1771)))
}

