class Solution {
    public boolean isPossible(int[] target) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        long totalSum = 0l;    
        
        for(int i: target) {
            pq.add(i);
            totalSum += i;
        }
            
        
        
        while(!pq.isEmpty()) {
            
            int num = pq.poll();
            long sumWithoutHighestNumber = totalSum - num;
            

            if(num == 1 || sumWithoutHighestNumber == 1)
                return true;
            
            
            if(sumWithoutHighestNumber == 0 ||sumWithoutHighestNumber > num)
                return false;
            
            
            int updatedMax = (int)(num % sumWithoutHighestNumber);
            
            if(updatedMax == 0)
                return false;

            pq.offer(updatedMax);
            totalSum = updatedMax + sumWithoutHighestNumber;
        }
        
        return true;
        
    }
}