package com.example.leetcode.twopoints

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

    val head:ListNode = ListNode(-1)
    var newList1 = list1
    var newList2 = list2
    var merge:ListNode? = head.next
    if (list1==null){
        return list2
    }else if(list2==null){
        return list1
    }else{
        while (newList1!=null && newList2!=null){
            if (newList1.`val`>=newList2.`val`){
                merge?.next = newList2
                newList2 = newList2.next
            }else{
                merge?.next = newList1
                newList1 = newList1.next
            }
            merge = merge?.next
        }
        if (newList1==null){
            merge?.next = newList2
        }else{
            merge?.next = newList1
        }
    }
    return head.next
}

class ListNode(var `val`:Int) {
    var next: ListNode? = null
}
