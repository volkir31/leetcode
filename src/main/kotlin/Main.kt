class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var current: ListNode? = this
        var out = ""
        while (current != null) {
            out += "${current.`val`} -> "
            current = current.next
        }
        return out
    }
}


fun main() {
    val head = ListNode(1)
    head.next = ListNode(8)
    head.next!!.next = ListNode(9)
    val head1 = ListNode(9)
    head1.next = ListNode(9)
    head1.next!!.next = ListNode(9)
    println(doubleIt(head1))
}

fun doubleIt(head: ListNode?): ListNode? {
    val values = mutableListOf<Int>()
    var current: ListNode? = head
    while (current != null) {
        values.add(current.`val`)
        current = current.next
    }


    val first = values.removeLast() * 2
    var node = ListNode(first % 10)
    var a = first / 10
    while (values.isNotEmpty()) {
        val currentElem = values.removeLast() * 2 + a
        a = currentElem / 10
        val tmpNode = ListNode(currentElem % 10)
        tmpNode.next = node
        node = tmpNode
    }
    if (a !=0) {
        val tmpNode = ListNode(a)
        tmpNode.next = node
        node = tmpNode
    }

    return node
}


//val heights = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
//val heights2 = intArrayOf(1, 1)
//val heights3 = intArrayOf(2,3,10,5,7,8,9)
//val heights4 = intArrayOf(1,2,4,3)
//val heights5 = intArrayOf(2,3,4,5,18,17,6)
//val heights6 = intArrayOf(5,3)
//println(maxArea(heights))
//println(maxArea(heights2))
//println(maxArea(heights3))
//println(maxArea(heights4))
//println(maxArea(heights5))
//println(maxArea(heights6))
fun maxArea(height: IntArray): Int {
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
        max = Math.max(max, min * (rightBound - leftBound))
    }

    return max
}
//
//val happiness = intArrayOf(1,2,3)
//val k = 2
//val happiness1 = intArrayOf(1,1,1,1)
//val k1 = 2
//val happiness2 = intArrayOf(2,3,4,5)
//val k2 = 1
//
//println(maximumHappinessSum(happiness, k))
//println(maximumHappinessSum(happiness1, k1))
//println(maximumHappinessSum(happiness2, k2))

fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
    val happiness = happiness.sorted()
    var decr = 0
    var sum = 0L
    for (i in 0 until k) {
        sum += Math.max(happiness[happiness.lastIndex - i] - decr, 0)
        decr++
    }

    return sum
}