package com.company

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals


class Tests {
    @Test
    fun testExample1() {
        assertEquals(threeSum(listOf(-1, 0, 1, 2, -1, -4)), listOf(listOf(-1, 0, 2), listOf(-1, 0, 1)))
    }

    @Test
    fun largeInputPerformanceTest() {
        val ints = List(size = 100) {
            (-105..106).random()
        }
//        assertTimeoutPreemptively(Duration.ofMillis(1000)) {
//            val size = threeSum(ints)?.size
//            assertEquals(size, 289)
//        }
    }

}


fun threeSum(nums: List<Int>): List<List<Int>>? {
    val nums = nums.sorted()
    val res: MutableList<List<Int>> = LinkedList()
    for (i in 0..nums.size - 2) {
        if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
            var start = i + 1
            var end = nums.size - 1
            val sum = 0 - nums[i]
            while (start < end) {
                if (nums[start] + nums[end] == sum) {
                    res.add(listOf(nums[i], nums[start], nums[end]))
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--
                    }
                    start++
                    end--
                } else if (nums[start] + nums[end] < sum) {
                    start++
                } else {
                    end--
                }
            }
        }
    }
    return res
}