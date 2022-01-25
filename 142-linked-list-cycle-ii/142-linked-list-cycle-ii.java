/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode prev = head;
        ListNode curr = head;
        while(curr!=null&&curr.next!=null){
            prev = prev.next;
            curr = curr.next.next;
            if(prev==curr)
                break;
        }
        
        if(curr==null||curr.next==null) return null;
        
        ListNode tmp = head;
        while(tmp!=prev){
            tmp=tmp.next;
            prev=prev.next;
        }
        
        return tmp;
    }
}