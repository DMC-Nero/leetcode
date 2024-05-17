/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        
        while(lenA < lenB) {
            headB = headB.next;
            lenB--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int getListLength(ListNode head){
        int count = 0;
		ListNode li = head;
		while (li != null) {
			count++;
			li = li.next;
		}
		return count;
    }
    
}