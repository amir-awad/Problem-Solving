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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while(currNode != null && currNode.next != null) {
            while(currNode.next != null && currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            }
            
            currNode = currNode.next;
        }
        
        return head;
    }
}