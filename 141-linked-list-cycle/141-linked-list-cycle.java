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
    public boolean hasCycle(ListNode head) {
        
        ListNode curr = head;
        int n = (int)1e4+5;
        
        while(n-->0){
            if(curr==null)
                return false;
            curr=curr.next;
        }
        
        return true;
    }
    
}