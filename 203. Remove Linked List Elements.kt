/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var dummy = ListNode(0)
        dummy.next = head
        var cur = dummy
        
        while (cur.next != null) {
            if (cur.next!!.`val` == `val`) {
                cur.next = cur.next!!.next
            } else {
                cur = cur.next!!
            }
        }
        return dummy.next
    }
}
