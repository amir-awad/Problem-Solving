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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        int min = 0;
        ListNode resLast=null;
        ListNode resHead = null;
        
        while(curr1!=null&&curr2!=null){
            
            if(curr1.val<=curr2.val){
                min=curr1.val;
                curr1 = curr1.next;
                
            }
            else{
                min = curr2.val;
                curr2 = curr2.next;
            }
            
            if(resLast==null&&resHead==null){
                resLast=resHead = new ListNode(min);
               
            }
            
            else {
                resLast.next = new ListNode(min);
                resLast = resLast.next;
            }
            
            
        }
        
        while(curr1!=null){
            resLast.next = new ListNode(curr1.val);
            curr1 = curr1.next;
            resLast= resLast.next;
        }
        
        while(curr2!=null){
            resLast.next = new ListNode(curr2.val);
            curr2 = curr2.next;
            resLast= resLast.next;
        }
        
        return resHead;
        
    }
}