package com.company.graph.breadthfirstsearch

import java.util.*


fun getImportance(employees: List<Employee>, queryId: Int): Int {
    val employeeMap: MutableMap<Int, Employee> = mutableMapOf()
    for (employee in employees) {
        employeeMap[employee.id] = employee
    }
    return dfs(queryId, employeeMap)
}

fun dfs(employeeId: Int, employeeMap: Map<Int, Employee>): Int {
    val employee = employeeMap[employeeId]
    var ans = 0
    if (employee != null) {
        ans = employee.importance
        for (subordinates in employee.subordinates) {
            ans += dfs(subordinates, employeeMap)
        }
    }
    return ans
}

fun getImportanceBFS(employees: List<Employee>, id: Int): Int {
    var total = 0
    val map: MutableMap<Int, Employee> = HashMap()
    for (employee in employees) {
        map[employee.id] = employee
    }
    val queue: Queue<Employee> = ArrayDeque()
    queue.offer(map[id])
    while (queue.isNotEmpty()) {
        val (_, importance, subordinates) = queue.poll()
        total += importance
        subordinates.forEach { subordinate ->
            queue.offer(map[subordinate])
        }
    }
    return total
}

fun main() {
    val employee1 = Employee(1, 5, listOf(2, 3))
    val employee2 = Employee(2, 3)
    val employee3 = Employee(3, 3)
    val list = mutableListOf<Employee>()
    list.add(employee1)
    list.add(employee2)
    list.add(employee3)
    println(getImportance(list, 1))
}


data class Employee(
        var id: Int = 0,
        var importance: Int = 0,
        var subordinates: List<Int> = listOf()
)