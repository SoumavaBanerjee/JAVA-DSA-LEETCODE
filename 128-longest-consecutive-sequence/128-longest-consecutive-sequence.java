class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        int maxSequence = 0;
        
        for(int i : nums)
            set.add(i);
        
        for(int i = 0; i < nums.length; i++) {
            int maxTillNow = 0;
            int el = nums[i];
            
            if(!set.contains(el-1)) {
                 while(set.contains(el)) {
                    maxTillNow = maxTillNow + 1;
                    el = el + 1;
                }
            }
            
            maxSequence = Math.max(maxSequence, maxTillNow);
        }
        
        return maxSequence;
    }
}