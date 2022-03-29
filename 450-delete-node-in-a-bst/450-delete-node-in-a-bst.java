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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
        
        if(root.val == key) {
             return helper(root);
        }
           
        
        if(key > root.val)
             root.right = deleteNode(root.right,key);
        
        if(key < root.val)
             root.left = deleteNode(root.left,key);
        
        
        return root;
    }
    
    TreeNode helper(TreeNode root) {
        
        if(root.left == null)
            return root.right;
        
        if(root.right == null)
            return root.left;
    
        TreeNode rightChild = root.right;
        TreeNode leafRightChild = getLeafRightChild(root.left);
        
        leafRightChild.right = rightChild;
        
        return root.left;
    }
    
    TreeNode getLeafRightChild(TreeNode root) {
        if(root.right == null)
            return root;
        
        return getLeafRightChild(root.right);
    }
    
    
    
}