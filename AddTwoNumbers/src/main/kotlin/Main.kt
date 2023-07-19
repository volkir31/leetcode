import java.math.BigInteger

// Task https://leetcode.com/problems/add-two-numbers/
data class ListNode(var `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var l: ListNode? = this
        val res = mutableListOf<Int>()
        while (l != null) {
            res.add(l.`val`)
            l = l.next
        }

        return res.toString()
    }
}

fun main() {
    val list1 = ListNode(9)
    val list2 = ListNode(1)
    list2.next = ListNode(9).apply {
        next = ListNode(9).apply {
            next = ListNode(9).apply {
                next = ListNode(9).apply {
                    next = ListNode(9).apply {
                        next = ListNode(9).apply {
                            next = ListNode(9).apply {
                                next = ListNode(9)
                            }
                        }
                    }
                }
            }
        }
    }
    addTwoNumbers(list1, list2)
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var result = l1!!.extractReversed() + l2!!.extractReversed()
    if (result == 0.toBigInteger()) return ListNode(0)
    val listNodes = mutableListOf<ListNode>()
    while (result != 0.toBigInteger()) {
        listNodes.add(ListNode((result % 10.toBigInteger()).toInt()))
        result /= 10.toBigInteger()
    }
    var res = listNodes.first()
    listNodes.drop(1).forEach {
        res += it
    }

    println(res)
    return res
}


operator fun ListNode.plus(value: ListNode): ListNode {
    if (next != null) {
        next!! + value
    } else {
        next = value
    }
    return this
}

fun ListNode.extractReversed(): BigInteger {
    var list: ListNode? = this
    val listDigits = mutableListOf<Int>()
    while (list != null) {
        listDigits.add(list.`val`)
        list = list.next
    }

    val reversedList = listDigits.reversed()
    var result = reversedList.first().toBigInteger()
    reversedList.drop(1).map {
        result = result * 10.toBigInteger() + it.toBigInteger()
    }

    return result
}
