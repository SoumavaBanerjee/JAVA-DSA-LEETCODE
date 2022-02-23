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
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        
        if(root == null) return result;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            for(int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                arr.add(temp.val);
                
                if(temp.left != null)
                    queue.offer(temp.left);
                
                if(temp.right != null)
                    queue.offer(temp.right);
            }
            
            result.add(arr.get(arr.size()-1));
        }
        
        return result;
    }
}