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
        HashSet<ListNode> h = new HashSet<ListNode>();
        ListNode curr=head;
        while(curr!=null){
            if(h.contains(curr))
                return curr;
            h.add(curr);
            curr=curr.next;
        }
        return null;
            
    }
}