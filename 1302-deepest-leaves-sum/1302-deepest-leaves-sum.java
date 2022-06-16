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
    
    private int sum = 0, maxDepth = 0;
    
    private void getSumAtDeepestLevel(TreeNode root, int level) {
        
        if(root == null)
            return;
        
        if(level > maxDepth) {
            sum = 0;
            maxDepth = level;
        }
        
        if(level == maxDepth) {
            sum += root.val;
        }
        
        
        getSumAtDeepestLevel(root.left, level + 1);
        getSumAtDeepestLevel(root.right, level + 1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        
        getSumAtDeepestLevel(root, 0);
        return sum;
    }
}