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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        k = k%length(head);
        
        while(k-->0){
                ListNode curr = head.next;
                ListNode prev = head;
                while(curr.next!=null){
                    curr = curr.next;
                    prev = prev.next;
                }
                
                curr.next=head;
                head = curr;
                prev.next=null;
            
            
        }
        return head;
        
    }
    
    
    public int length(ListNode curr){
        ListNode tmp = curr;
        int c=0;
        while(tmp!=null){
            tmp=tmp.next;
            c++;
        }
        return c;
    }
    
}