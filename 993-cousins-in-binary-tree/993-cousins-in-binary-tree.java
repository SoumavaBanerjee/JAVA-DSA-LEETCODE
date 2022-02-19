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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            
            boolean foundX = false;
            boolean foundY = false;
            int size = queue.size();
            
            for(int i = 0; i < size; i++ ) {
                
                TreeNode temp = queue.poll();
                
                if(temp.val == x)
                    foundX = true;
                
                if(temp.val == y)
                    foundY = true;
                
                if(temp.left != null && temp.right != null)
                    if((temp.left.val == x && temp.right.val == y) || (temp.left.val == y && temp.right.val == x))
                         return false;
                
                if(temp.left != null)
                    queue.offer(temp.left);
                
                if(temp.right != null)
                    queue.offer(temp.right);
                
            }
            
            if(foundX && foundY)
                return true;
        }
        
        return false;
        
    }
    
}