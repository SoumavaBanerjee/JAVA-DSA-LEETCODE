/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)
            return null;
        
        
        if(root.val == p.val || root.val == q.val)
            return root;
        
        TreeNode pref = lowestCommonAncestor(root.left,p,q);
        
        TreeNode qref = lowestCommonAncestor(root.right,p,q);
        
        if(pref != null && qref != null)
            return root;
        
        
        if(pref != null)
            return pref;
        
        if(qref != null)
            return qref;
        
        return null;
    }
}