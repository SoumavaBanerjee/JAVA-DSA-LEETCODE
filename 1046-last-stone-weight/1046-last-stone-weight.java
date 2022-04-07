class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int p: stones)
            q.add(p);
        
        while(q.size() > 0) {
            
            if(q.size() == 1)
                return q.poll();
            
            int a = q.poll();
            int b = q.poll();
            
            if(a != b)
                q.offer(a-b);
        }
        
        return q.size() == 0 ? 0 : q.poll();
    }
}