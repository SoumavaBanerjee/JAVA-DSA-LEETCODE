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
    
    public boolean helper(long high, long low, TreeNode root) {
        if(root == null)
            return true;
        
        if(root.val >= high || root.val <= low)
            return false;
        
        return helper(root.val, low, root.left ) && helper(high, root.val, root.right);
    }
   
    
    public boolean isValidBST(TreeNode root) {
        return helper(Long.MAX_VALUE, Long.MIN_VALUE, root);
    }
}







