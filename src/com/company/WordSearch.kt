package com.company

fun main() {
    val grid = arrayOf(charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E'))

    println(existWord(grid, "ABCCED"))
}

fun existWord(board: Array<CharArray>, word: String): Boolean {

    val visitedArray = Array(board.size) {
        BooleanArray(board[0].size)
    }

    for (i in board.indices) {
        for (j in board[i].indices) {
            if (word[0] == board[i][j]) {
                if (searchWord(board, word, i, j, visitedArray, 0)) {
                    return true
                }
            }
        }
    }
    return false
}

fun searchWord(board: Array<CharArray>, word: String, i: Int, j: Int, visitedArray: Array<BooleanArray>, wordIndex: Int): Boolean {
    if (wordIndex == word.length) {
        return true
    }

    //checking boundary conditions
    if (i >= board.size || i < 0 || j >= board[i].size || j < 0 || board[i][j] != word[wordIndex] || visitedArray[i][j]) {
        return false
    }

    visitedArray[i][j] = true

    if (searchWord(board, word, i - 1, j, visitedArray, wordIndex + 1) ||
            searchWord(board, word, i + 1, j, visitedArray, wordIndex + 1) ||
            searchWord(board, word, i, j - 1, visitedArray, wordIndex + 1) ||
            searchWord(board, word, i, j + 1, visitedArray, wordIndex + 1)) {

        return true
    }
    visitedArray[i][j] = false

    return false
}
