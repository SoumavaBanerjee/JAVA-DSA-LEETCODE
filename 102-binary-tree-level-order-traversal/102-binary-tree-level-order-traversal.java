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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null) return result;
        
        queue.offer(root);
        
        
        while(!queue.isEmpty()) {
            
            List<Integer> arr = new LinkedList<Integer>();
            int count = queue.size();
            
            for(int i=0 ; i < count; i++) {
                 TreeNode temp = queue.poll();
                 arr.add(temp.val);
            
                 if(temp.left != null)
                    queue.offer(temp.left);
                
                 if(temp.right != null)
                    queue.offer(temp.right);
            }
            
           result.add(arr);
           
        }
        
        return result;
    }
}