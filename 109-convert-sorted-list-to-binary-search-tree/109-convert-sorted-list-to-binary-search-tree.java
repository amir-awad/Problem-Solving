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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode curr = head;
        int length = length(curr);
        curr=head;
        TreeNode root = new TreeNode();
        return generateBST(curr,root,0,length-1);
    }
    
    public TreeNode generateBST(ListNode curr,TreeNode root,int lowerBound, int higherBound){
        if(lowerBound>higherBound)
            return root;
        int mid = (lowerBound+higherBound)/2;
        
        root = new TreeNode(getNode(curr,mid));
        
        root.left = generateBST(curr,root.left,lowerBound,mid-1);
        root.right = generateBST(curr,root.right,mid+1,higherBound);
        
        return root;
    }
    
    public int getNode(ListNode curr,int key){
        ListNode tmp = curr;
        while(key-->0){
            tmp=tmp.next;
        }
        
        return tmp.val;
    }
        
        
    public int length(ListNode curr){
        
        if(curr==null)
            return 0;
        return 1 + length(curr.next);
    }
}








