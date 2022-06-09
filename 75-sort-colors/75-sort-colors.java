class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        
        int low = 0;
        int high = len-1;
        int mid = 0;
        
        int temp = 0;
        
        
        while(mid <= high) {
            switch(nums[mid]) {
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                    
                case 0:
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                    
            }
        }
        
    }
}