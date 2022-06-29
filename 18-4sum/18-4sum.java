class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        long limit = (long) 4 * nums[0];
        
        if(n < 4 || limit > target) 
           return result;
        
        
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int start = j + 1;
                int end = n - 1;
                
                while(start < end) {
                    
                    if(nums[i] + nums[j] == target - (nums[start] + nums[end])) {
                        ArrayList<Integer> sublist = new ArrayList<Integer>();
                        sublist.add(nums[i]);
                        sublist.add(nums[j]);
                        sublist.add(nums[start]);
                        sublist.add(nums[end]);
                        result.add(sublist);
                        
                        // remove dupes
                        while(start < end && nums[start] == nums[start+1]) start++;
                        while(start < end && nums[end] == nums[end-1]) end--;
                        start++; end--;
                        
                    }
                    
                    else if(nums[i] + nums[j] < target - (nums[start] + nums[end])) {
                        start++;
                    }
                            
                    else
                        end--;
                    
                }
                // cleanup dupes from j
                while(j < n - 1 && nums[j] == nums[j+1]) j++;
            }
            while(i < n - 1 && nums[i] == nums[i+1]) i++; 
        }
        
        return result;
    }
                            
   
}