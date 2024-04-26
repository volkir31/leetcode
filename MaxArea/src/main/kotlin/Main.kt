// Task - https://leetcode.com/problems/container-with-most-water/
fun maxArea(height: IntArray): Int {
    if (height.size == 2) return height.min()

    var leftBound = 0
    var rightBound = height.lastIndex
    var max = Math.min(height[leftBound], height[rightBound]) * rightBound
    while (leftBound != rightBound) {
        if (height[leftBound] < height[rightBound]) {
            leftBound++
        } else {
            rightBound--
        }
        val min = Math.min(height[leftBound], height[rightBound])
        val capacity = min * (rightBound - leftBound)
        max = Math.max(max, capacity)
    }

    return max
}
fun main() {
    val heights = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val heights2 = intArrayOf(1, 1)
    val heights3 = intArrayOf(2,3,10,5,7,8,9)
    val heights4 = intArrayOf(1,2,4,3)
    val heights5 = intArrayOf(2,3,4,5,18,17,6)

    println(maxArea(heights))
    println(maxArea(heights2))
    println(maxArea(heights3))
    println(maxArea(heights4))
    println(maxArea(heights5))
}