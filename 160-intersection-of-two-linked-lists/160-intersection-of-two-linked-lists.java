/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
	// The idea is to put all the adresses of one LinkedList nodes in an HashSet or
	//any other proper tool, then check if it has any address of the second linkedList nodes
	// found it? return it
	// else return null
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<ListNode>();
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        if(curr1==null||curr2==null)
            return null;
        
        while(curr1!=null){
            hs.add(curr1);
            curr1=curr1.next;
        }
        
        while(curr2!=null){
            if(hs.contains(curr2))
                return curr2;
            hs.add(curr2);
            curr2=curr2.next;
        }
        
        return null;
        
    }
}