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
    
    public boolean getPath(TreeNode root, List<TreeNode> path, TreeNode target) {
        
        if(root == null)
            return false;
        
        path.add(root);
        
         if (root.val == target.val)    
            return true;
        
        if(getPath(root.left, path, target) || getPath(root.right, path, target))
            return true;
        
        path.remove(path.size()-1);
        return false;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)
            return null;
        
        List<TreeNode> path1 = new ArrayList<TreeNode>();
        List<TreeNode> path2 = new ArrayList<TreeNode>();
        int itr;
        
        getPath(root, path1, p);
        getPath(root, path2, q);
        
        int size = Math.min(path1.size(), path2.size());
        
        for(itr = 0; itr < size; itr++) 
            if(path1.get(itr).val != path2.get(itr).val)
                return path1.get(itr-1);
        
            
        
        
        return path1.get(itr-1);
        
    }
}