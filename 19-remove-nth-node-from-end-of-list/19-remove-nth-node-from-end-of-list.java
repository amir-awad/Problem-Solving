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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode curr = head;
            int length = length(curr);
            if(length==1) return null;
            if(n==length) return head.next;
            int pos = length-n;
        
            curr = head;
            
            while(pos-->1){
                curr=curr.next;
            }
            
            if(curr.next!=null)
                curr.next = curr.next.next;
        return head;
    }
    
    
    public int length(ListNode curr){
        if(curr==null)
            return 0;
        return 1 + length(curr.next);
    }
}