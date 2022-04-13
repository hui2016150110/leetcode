package com.example.leetcode.twopoints

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var first = head
    val ans = ListNode(0)
    ans.next = head
    var second:ListNode? = ans

    var i = 0
    while (i<n){
        i++
        first = first?.next
    }
    while (first!=null){
        second = second?.next
        first = first.next
    }
    second?.next = second?.next?.next
    return ans.next
}
