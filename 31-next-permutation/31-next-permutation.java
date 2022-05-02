class Solution {
    public void nextPermutation(int[] nums) {
        
        int breakPoint = -1, swapPoint = -1, len = nums.length;
        
        if(nums == null || len == 0)
            return;
        
        for(int i = len-2; i >= 0; i--)
            if(nums[i] < nums[i+1]) {
                breakPoint = i;
                break;
            }
        
        if(breakPoint == -1) {
            reverse(nums, 0, len-1);
            return;
        }
        
        for(int i = len-1; i >= 0; i--)
            if(nums[i] > nums[breakPoint]) {
                swap(nums, i, breakPoint);
                break;
            }
        
        reverse(nums, breakPoint + 1, len-1);
        
        return;
    }
    
    public void swap (int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public void reverse(int[] A, int i, int j) {
        while(i < j) swap(A,i++,j--);
    }
}