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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode oddHead = new ListNode();
        ListNode p1 = oddHead;
        ListNode evenHead = new ListNode();
        ListNode p2 = evenHead;
        
        boolean isOdd = true;
        while(curr != null) {
            ListNode currNext = curr.next;
            curr.next = null;
            if(isOdd) {
                p1.next = curr;
                p1 = p1.next;
                isOdd = false;
            } else {
                p2.next = curr;
                p2 = p2.next;
                isOdd = true;
            }
            curr = currNext;
        }
        
        p1.next = evenHead.next;
        
        return oddHead.next;
    }
}