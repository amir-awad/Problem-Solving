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
    
    public ListNode mid(ListNode slow, ListNode fast) {
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        
        return prev;
        
    }
    
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode midNode = mid(slow,fast);
        ListNode headOfReverse = reverse(midNode);
        
        ListNode p1 = head;
        ListNode p2 = headOfReverse;
        
        int maxTwinSum = 0;
        while(p2 != null) {
            if(maxTwinSum < p1.val + p2.val) {
                maxTwinSum = p1.val + p2.val;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return maxTwinSum;
    }
}