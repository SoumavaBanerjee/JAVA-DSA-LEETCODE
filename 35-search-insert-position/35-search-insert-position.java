class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int high, low, mid;
        
        
        low = 0;
        mid = 0;
        high = arr.length-1;
        
        while(low <= high) {
            
            mid = low + (high - low) / 2;
            
            if(arr[mid] == target)
                return mid;
            
            if(arr[mid] < target)
                low = mid + 1;
                
            if(arr[mid] > target)
                high = mid - 1; 
        }
        
        return arr[mid] > target ? mid : mid+1;
    }
}