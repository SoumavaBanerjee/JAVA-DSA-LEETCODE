class Solution {
    public boolean checkPossibility(int[] nums) {
        int violations = 0;
        
        if(nums.length <= 2)
            return true;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i]) {
                 violations++;
                
                 if(i >= 2 && nums[i-2] > nums[i]) {
                    nums[i] = nums[i-1];
                 } else {
                    nums[i-1] = nums[i];
                }
            }
                
        }
        
        return violations <= 1;
    }
}