package com.company.gfg.arrays

import java.util.*


class TopKFreqkt {
    fun topKFrequent(nums: IntArray?, k: Int): List<Int>? {
        // Override the compare method so that elements in nums are added to PriorityQueue according to their frequency
        // Time complexity: O(nlogk)
        val ans: MutableList<Int> = ArrayList()
        if (nums == null || k > nums.size || k <= 0) {
            return ans
        }
        val freqMap: MutableMap<Int, Int> = HashMap()
        for (e in nums) {
            freqMap[e] = freqMap.getOrDefault(e, 0) + 1
        }
        val pq = PriorityQueue(Comparator<Int> { a: Int?, b: Int? -> freqMap[a]!! - freqMap[b]!! })
        // to reduce the tome complexity from O(nlogn) to O(nlogk), keep the number of elements in queue <= k
        for (key in freqMap.keys) {
            if (pq.size < k) {
                pq.add(key)
            } else if (freqMap[key]!! > freqMap[pq.peek()]!!) {
                pq.remove()
                pq.add(key)
            }
        }
        for (i in 0 until k) {
            ans.add(pq.remove())
        }
        return ans
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
        }
    }
}