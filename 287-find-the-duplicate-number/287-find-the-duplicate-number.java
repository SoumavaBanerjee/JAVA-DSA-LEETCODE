class Solution {
    public int findDuplicate(int[] nums) {
        
        // method 3 --> floyd's cycle detection
        int n = nums.length;
        
        int fast = nums[0];
        int slow = nums[0];
        
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while(fast != slow);
            
        fast = nums[0];
        
        while(fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }
        
        return slow;
    }
}