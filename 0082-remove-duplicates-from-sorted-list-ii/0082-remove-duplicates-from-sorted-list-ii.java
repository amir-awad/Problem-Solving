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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        
        ListNode prev = dummyNode;
        ListNode curr = prev.next;
        
        while(curr != null && curr.next != null) {
            boolean ok = true;
            while(curr.next != null && curr.val == curr.next.val) {
                curr.next = curr.next.next;
                ok = false;
            }
            if(ok) {
                prev = prev.next;
                curr = curr.next;
            } else {
                prev.next = curr.next;
                curr = prev.next;
            }
            
        }
        
        return dummyNode.next;
    }
}