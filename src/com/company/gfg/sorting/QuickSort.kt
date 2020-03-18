package com.company.gfg.sorting

class QuickSort {
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    private fun sort(arr: IntArray, low: Int, high: Int) {
        /* pi is partitioning index, arr[pi] is now at right place */
        if (low < high) {
            val pi = partition(arr, low, high)
            println("pi $pi")
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1)
            sort(arr, pi + 1, high)
        }
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1 // index of smaller element
        for (j in low until high) { // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++
                // swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        printArray(arr)
        println("===========")
        // swap arr[i+1] and arr[high] (or pivot)
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }

    private fun printArray(arr: IntArray) {
        for (i1 in arr) {
            print("$i1 ")
        }
        println()
    }

    companion object {
        /*
        64, 25, 12, 22, 11
        25 64 12 22 11
        25 12 64 22 11
        25 12 22 64 11
        25 12 22 11 64
        ===========
        12 25 22 11 64
        12 22 25 11 64
        12 22 11 25 64
        ===========
        12 22 11 25 64
        12 11 22 25 64
        ===========
        11 12 22 25 64
        ===========
        Sorted array
        11 12 22 25 64

     */
        @JvmStatic
        fun main(args: Array<String>) {
            val ob = QuickSort()
            val arr = intArrayOf(64, 25, 12, 22, 11)
            ob.sort(arr, 0, arr.size - 1)
            println("Sorted array")
            ob.printArray(arr)
        }
    }
}