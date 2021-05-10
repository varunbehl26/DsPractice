package com.company.heap

import java.util.*

interface Heap<Element> : Collection<Element> {

    /*
    “The peek operation is a generalization of methods returning
    the min or the max depending on the implementation. ”
     */
    fun peek(): Element?

}

/*
    To imply heap property, Comparator implementation is added
 */
abstract class AbstractHeap<Element>() : Heap<Element> {

    /*
        This method returns a negative integer, zero, or a positive integer
        as the first argument is less than, equal to, or greater than the second
     */
    abstract fun compare(a: Element, b: Element): Int

    var elements: ArrayList<Element> = ArrayList()

    override val count: Int
        get() = elements.size

    override fun peek(): Element? {
        return elements.first()
    }

    private fun leftChildIndex(index: Int) = (2 * index) + 1

    private fun rightChildIndex(index: Int) = (2 * index) + 2

    private fun parentIndex(index: Int) = (index - 1) / 2

    /*
        Insertion begins from end , “Inserted might have a higher priority than its parents.
        It does so by comparing the current node with its parent and swapping them if needed.”
     */
    override fun insert(element: Element) {
        elements.add(element)
        shiftUp(count - 1)
    }

    /*
        shiftUp swaps the current node with its parent,
        as long as that node has a higher priority than its parent.
     */
    private fun shiftUp(index: Int) {
        var localChildIndex = index
        var localParentIndex = parentIndex(localChildIndex)

        while (localChildIndex > 0 && compare(elements[localChildIndex], elements[localParentIndex]) > 0) {
            Collections.swap(elements, localChildIndex, localParentIndex)
            localChildIndex = localParentIndex
            localParentIndex = parentIndex(localChildIndex)
        }

    }


    /*
        Removing from heap, removes the root node ,“you must first swap the root node with the last element in the heap.”
        Now, you must check the max heap’s integrity. But first, ask yourself, “Is it still a max heap?
     */
    override fun remove(): Element? {
        if (isEmpty) return null

        Collections.swap(elements, 0, count - 1)
        val item = elements.removeAt(count - 1)
        shiftDown(0)
        return item
    }

    /*

    “The overall complexity of remove() is O(log n). Swapping elements in an array takes only O(1),
     while sifting down elements in a heap takes O(log n) time.”

     */
    private fun shiftDown(index: Int) {
        var localParentIndex = index // 1
        while (true) { // 2
            val left = leftChildIndex(localParentIndex) //3
            val right = rightChildIndex(localParentIndex)
            var candidate = localParentIndex // 4
            if (left < count &&
                    compare(elements[left], elements[candidate]) > 0) {
                candidate = left //5
            }
            if (right < count &&
                    compare(elements[right], elements[candidate]) > 0) {
                candidate = right // 6
            }
            if (candidate == localParentIndex) {
                return // 7
            }
            Collections.swap(elements, localParentIndex, candidate) // 8
            localParentIndex = candidate
        }
    }

}



