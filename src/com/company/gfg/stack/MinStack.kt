package com.company.gfg.stack

fun main() {

    //* Your MinStack object will be instantiated and called as such:
    val obj = MinStack()
    obj.push(1)
    obj.push(4)
    obj.pop()
    var param_3 = obj.top()
    var param_4 = obj.getMin()
    println(param_3)
    println(param_4)


}

class MinStack() {

    class StackNode(
            var data: Int,
            var minSoFar: Int
    )

    /** initialize your data structure here. */

    var capacity: Int = 20
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
