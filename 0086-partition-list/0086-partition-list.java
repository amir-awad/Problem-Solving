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
    public ListNode partition(ListNode head, int x) {
        ListNode beforeDummyNode = new ListNode();
        ListNode afterDummyNode = new ListNode();
        
        ListNode curr = head;
        ListNode p1 = beforeDummyNode;
        ListNode p2 = afterDummyNode;
        while(curr != null) {
            ListNode currNext = curr.next;
            curr.next = null;
            if(curr.val < x) {
                p1.next = curr;
                p1 = p1.next;
            } else {
                p2.next = curr;
                p2 = p2.next;
            }
            
            curr = currNext;
        }
        
        p1.next = afterDummyNode.next;
        return beforeDummyNode.next;
    }
}