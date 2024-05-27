/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // Find the middle
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if( fast != null) {     // odd nodes: let right half smaller
            slow = slow.next;
        }
        
        // Reverse the second half
        slow = reverseList(slow);
        fast = head;
        
        // Start comparing one by one
        while (slow != null) {
            if (fast.val != slow.val)
                return false;
            
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head) {
        // code to reverse a List
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}




