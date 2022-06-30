class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int median = nums[n/2];
        
        int ans = 0;
        for(int i : nums)
            ans = ans + Math.abs(median - i);
        
        return ans;
    }
}