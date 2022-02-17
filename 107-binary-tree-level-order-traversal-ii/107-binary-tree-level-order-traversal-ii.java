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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null)
            return result;

        queue.offer(root);
        
        while(!queue.isEmpty()) {
            List<Integer> temp = new LinkedList<Integer>();
            int count = queue.size();
            
            for(int i = 0; i < count; i++){
                TreeNode tempNode = queue.poll();
                temp.add(tempNode.val);
                
                if(tempNode.left != null)
                    queue.offer(tempNode.left);
                
                if(tempNode.right != null)
                    queue.offer(tempNode.right);
                
            }
            
            result.add(0,temp);
        }
        return result;
    }
}