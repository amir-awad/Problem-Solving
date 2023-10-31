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
    
    public ListNode beforeMiddle(ListNode slowPtr, ListNode fastPtr) {
        
        while(fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        return slowPtr;
    }
    
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;
        ListNode beforeMiddleNode = beforeMiddle(slowPtr, fastPtr);
        beforeMiddleNode.next = beforeMiddleNode.next.next;
        
        return head;
    }
}