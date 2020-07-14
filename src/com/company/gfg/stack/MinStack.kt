package com.company.gfg.stack

fun main() {

    //* Your MinStack object will be instantiated and called as such:
    val obj = MinStack()
    obj.push(-2)
    obj.push(0)
    obj.push(-3)
    println(obj.getMin())
    obj.pop()
    println(obj.top())
    println(obj.getMin())


}

class MinStack {

    class StackNode(
            var data: Int,
            var minSoFar: Int
    )

    /** initialize your data structure here. */
    var nodes = arrayListOf<StackNode>()
    var top = -1
    var minSoFar = Int.MAX_VALUE

    fun push(x: Int) {
        minSoFar = Math.min(minSoFar, x)
        nodes.add(++top, StackNode(x, minSoFar))
    }

    fun pop() {
        if (top != -1) {
            nodes.removeAt(top--)
        }
    }

    fun top(): Int {
        return nodes.get(top).data
    }

    fun getMin(): Int {
        return nodes.get(top).minSoFar
    }

}
