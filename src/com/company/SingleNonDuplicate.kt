package com.company

fun main() {
    print(singleNonDuplicate(intArrayOf(3, 3, 7, 7, 10, 11, 11)))
}


fun singleNonDuplicate(nums: IntArray): Int {
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        // We want the first element of the middle pair,
        // which should be at an even index if the left part is sorted.
        // Example:
        // Index: 0 1 2 3 4 5 6
        // Array: 1 1 3 3 4 8 8
        //            ^
        var mid = (start + end) / 2
        if (mid % 2 == 1) {
            mid--
        }

        // We didn't find a pair. The single element must be on the left.
        // (pipes mean start & end)
        // Example: |0 1 1 3 3 6 6|
        //               ^ ^
        // Next:    |0 1 1|3 3 6 6
        if (nums[mid] != nums[mid + 1]) {
            end = mid
        } else {
            start = mid + 2
        }
    }

    // 'start' should always be at the beginning of a pair.
    // When 'start > end', start must be the single element.
    return nums[start]
}