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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        ListNode prev = new ListNode(Integer.MIN_VALUE, head);
        int sum = 0;
        while(start != null) {
            while(end != null) {
                sum += end.val;
                if(sum == 0) {
                    break;
                }
                
                end = end.next;
            }
            
            if(sum == 0) {
                if(start == head) {
                    head = end.next;
                }
                prev.next = end.next;
                start = prev.next;
                end = start;
            } else {
                sum = 0;
                prev = prev.next;
                start = start.next;
                end = start;
            }

        }
        
        return head;
    }
}