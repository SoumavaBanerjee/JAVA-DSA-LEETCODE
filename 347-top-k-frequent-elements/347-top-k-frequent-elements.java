class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums)
            map.put(i, map.getOrDefault(i,0) + 1);
           
        
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a.getValue(),b.getValue()));
        
        for(Map.Entry<Integer,Integer> pair : map.entrySet()) {
            minHeap.offer(pair);
            
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
        int[] ans = new int[k];
        
        for(int i = 0; i < k; i++)
            ans[i] = minHeap.poll().getKey();
        
        
        return ans;
    }
}