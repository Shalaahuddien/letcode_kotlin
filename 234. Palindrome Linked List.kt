/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int, var next: ListNode? = null)
 */

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null || head.next == null) return true
        
        var slow = head
        var fast = head
        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        
        var prev: ListNode? = null
        var curr = slow?.next
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        
        slow = head
        fast = prev
        while (fast != null) {
            if (slow?.`val` != fast.`val`) return false
            slow = slow?.next
            fast = fast.next
        }
        
        return true
    }
}