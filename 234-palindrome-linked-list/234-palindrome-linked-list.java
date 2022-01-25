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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
            return true;
        ListNode originHead = new ListNode(head.val);
        ListNode originLast = originHead;
        ListNode curr = head.next;
        while(curr!=null){
            originLast.next = new ListNode(curr.val);
            originLast = originLast.next;
            curr=curr.next;
        }
        
        ListNode prev = head;
        ListNode preNode = prev;
        curr = head.next;
        while(curr.next!=null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        
        curr.next = prev;
        preNode.next = null;
        head = curr;
        
        ListNode curr1 = head;
        ListNode curr2 = originHead;
        while(curr1!=null&&curr2!=null){
            if(curr1.val!=curr2.val)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
    
  
}