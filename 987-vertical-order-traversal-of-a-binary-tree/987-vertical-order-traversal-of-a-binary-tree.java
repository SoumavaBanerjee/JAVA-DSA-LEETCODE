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
    
   class Pair {
       TreeNode node;
       int row;
       int col;
       
       public Pair(TreeNode node, int row, int col) {
           this.node = node;
           this.row = row;
           this.col = col;
       }
   }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        // store levels and verticles of Nodes;
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap();
        Queue<Pair> queue = new LinkedList<Pair>();
        
        if(root == null)
            return new ArrayList<List<Integer>>();
        
        // traverse level order
        
        queue.offer( new Pair(root, 0, 0));
        
        while(!queue.isEmpty()) {
            
            Pair tuple = queue.poll();
            int x = tuple.row;
            int y = tuple.col;
            
            // place the newly discovered tuple in it's right position in the hashmap
            
            if(!map.containsKey(x))
                map.put(x,new TreeMap<Integer, PriorityQueue<Integer>>());
            
            if(!map.get(x).containsKey(y))
                map.get(x).put(y, new PriorityQueue<Integer>());
            
            
            map.get(x).get(y).offer(tuple.node.val);
            
            
            
            
            // push it's left and right child to queue
            
            if(tuple.node.left != null)
                queue.offer(new Pair(tuple.node.left, x - 1, y + 1));
            
            if(tuple.node.right != null)
                queue.offer(new Pair(tuple.node.right, x + 1, y + 1));
            
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            
            result.add(new ArrayList<>());
            
            for (PriorityQueue<Integer> nodes : ys.values()) {
                
                while (!nodes.isEmpty()) {
                    result.get(result.size()-1).add(nodes.poll());
                }
                
            } 
            
        }
        
        return result;
        
    }
}




















