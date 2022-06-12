class Solution {
    public int findDuplicate(int[] nums) {
        
        // method 2 --> frequency array
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        for( Map.Entry<Integer,Integer> pair : map.entrySet()) {
            if(pair.getValue() > 1)
                return pair.getKey();
        }
        
        return -1;
    }
}