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
    public void reorderList(ListNode head) {
        int len = 0;
        ListNode curr = head;
        while(curr != null) {
            len++;
            curr = curr.next;
        }
        
        Stack<ListNode> listSecondHalf = new Stack<>();
        curr = head;
        for(int i=1; i <= len && curr != null; i++) {
            if((len % 2 == 0 && i > (len / 2)) || (len % 2 != 0 && i > (len / 2 + 1))) {
                listSecondHalf.push(curr);
            }
            
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null && !listSecondHalf.isEmpty()) {
            ListNode tmp = curr.next;
            curr.next = listSecondHalf.pop();
            curr.next.next = tmp;
            curr = tmp;
        }
        
        curr.next = null;
    }
}