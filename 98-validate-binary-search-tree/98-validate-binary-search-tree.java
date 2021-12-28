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
    //The idea is to get the inorder traversal of the tree and check if it's sorted.
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        ArrayList<Integer> al = helper(root,tmp);
        
        return isSorted(al);
    }
    
    public static ArrayList<Integer> helper(TreeNode root,ArrayList<Integer> tmp){
       if(root == null)
            return tmp;
       helper(root.left,tmp);
        tmp.add(root.val);
        helper(root.right,tmp);
        
        return tmp;
    }
    
    public static boolean isSorted(ArrayList<Integer> al){
        
        for(int i=0; i < al.size()-1;i++)
            if(al.get(i) >= al.get(i+1))
                return false;
        return true;
    }
}