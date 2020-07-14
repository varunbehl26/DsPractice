package com.company

fun main() {
    val image = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 1))

    val arr = floodFill(image, 1, 1, 1)

    println(arr)

}


fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    val prevColor: Int = image[sr][sc]

    floodFillUtil(image, sr, sc, prevColor, newColor);

    return image
}

fun floodFillUtil(image: Array<IntArray>, sr: Int, sc: Int, prevColor: Int, newColor: Int) {

    // Base cases
    if (sr < 0 || sr >= image.size || sc < 0 || sc >= image[0].size) {
        return
    }
    if (image[sr][sc] != prevColor) {
        return
    }

    image[sr][sc] = newColor

    floodFillUtil(image, sr + 1, sc, prevColor, newColor);
    floodFillUtil(image, sr - 1, sc, prevColor, newColor);
    floodFillUtil(image, sr, sc + 1, prevColor, newColor);
    floodFillUtil(image, sr, sc - 1, prevColor, newColor);

}


fun dfs(image: Array<IntArray>, r: Int, c: Int, color: Int, newColor: Int) {
    if (image[r][c] == color) {
        image[r][c] = newColor
        if (r >= 1) dfs(image, r - 1, c, color, newColor)
        if (c >= 1) dfs(image, r, c - 1, color, newColor)
        if (r + 1 < image.size) dfs(image, r + 1, c, color, newColor)
        if (c + 1 < image[0].size) dfs(image, r, c + 1, color, newColor)
    }
}
