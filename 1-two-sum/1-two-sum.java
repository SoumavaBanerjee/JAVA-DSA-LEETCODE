class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            int remainder = target - nums[i];
            if(map.containsKey(remainder)){
                int j = map.get(remainder);
                return new int[]{i,j};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{-1 , -1};
        
    }
}