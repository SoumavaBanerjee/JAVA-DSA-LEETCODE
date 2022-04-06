class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Long> frequencyMap = new HashMap<Integer, Long>();
        
        for(int elem: arr) {
            long freq = frequencyMap.getOrDefault(elem,0l);
            frequencyMap.put(elem,freq+1);
        }
        
        long ans = 0;
        
        for(Integer el1: frequencyMap.keySet()) {
            for(Integer el2: frequencyMap.keySet()) {
                Integer el3 = target - el1 - el2;
                
                if(frequencyMap.containsKey(el3)) {
                    long freq1 = frequencyMap.get(el1);
                    long freq2 = frequencyMap.get(el2);
                    long freq3 = frequencyMap.get(el3);


                    if(el1 == el2 && el2 == el3)
                        ans += freq1 * (freq1-1) * (freq2-2) / 6;
                    else if(el1 == el2 && el2 != el3)
                        ans += (freq1 * (freq2-1))/ 2 * freq3;
                    else if(el1 < el2 && el2 < el3)
                        ans += freq1 * freq2 * freq3; 
                }
                
            }
            
            ans %= 1000000007;
            
        }
        return (int) ans;  
    }
}