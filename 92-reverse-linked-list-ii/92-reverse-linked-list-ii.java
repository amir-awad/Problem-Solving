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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null||left==right)
            return head;
        if(head.next.next==null){
            ListNode tmp = head;
            head = head.next;
            head.next = tmp;
            tmp.next=null;
            return head;
        }
        ListNode openingNode = getNode(head,left);
        ListNode closingNode = getNode(head, right);
        ListNode preNode = getNode(head,left-1);
        ListNode postNode = getNode(head, right+1);
        ListNode traversalNode = openingNode.next;
        
        ListNode open = openingNode;
        ListNode h = head;
        
        while(traversalNode!=closingNode){
            
            ListNode tmp = traversalNode.next;
            traversalNode.next = openingNode;
            openingNode = traversalNode;
            traversalNode = tmp;
            
        }
        System.out.println(traversalNode.val);
        System.out.println(openingNode.val);
        System.out.println(preNode);
        // System.out.println(postNode.val);
        
        if(preNode==null) head = traversalNode;
        traversalNode.next = openingNode;
        open.next = postNode;
        if(preNode!=null)
        preNode.next = traversalNode;
        
        
        return head;
    }
    
    
    
    public ListNode getNode(ListNode head,int n){
        if(n <= 0) return null;
        ListNode tmp = head;
        while(n-->1){
                if(tmp == null) return null;
                tmp = tmp.next;
        }
        return tmp;
    }
}