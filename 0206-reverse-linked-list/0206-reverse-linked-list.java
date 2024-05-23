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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode adv = head;
        ListNode temp = null;
        
        while(adv != null){
            temp = adv;
            adv = adv.next;
            temp.next = prev;
            prev = temp;
            
        }
        return temp;
        
    }
}