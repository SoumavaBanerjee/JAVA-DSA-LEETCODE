class Solution {
    
    
    static int binarySearch(int[] nums, int target, int high, int low, boolean isFirstOccurence ) {
       
        int ans = -1;
        
        while(low <= high) {
            
            int mid = low + (high - low) / 2;
            
            if(nums[mid] == target && isFirstOccurence) {
                ans = mid;
                high = mid - 1;
            }
            
            
            if(nums[mid] == target && !isFirstOccurence) {
                ans = mid;
                low = mid + 1;
            }    
                
            
            if(nums[mid] > target)
                high = mid - 1;
            
            if(nums[mid] < target)
                low = mid + 1;
        }
        
        return  ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
       
        if(nums.length == 0)
            return new int[]{-1,-1};
        
        int firstOccur = binarySearch(nums,target, nums.length - 1, 0, true);
        int lastOccur = binarySearch(nums, target, nums.length -1 , 0, false);
        
        return new int[]{firstOccur,lastOccur};
        
    }
}