class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = nums.length;
        
        
        for(int i = 0; i < n; i++) {
            int start = i+1;
            int end = n - 1;
            int req = -1 * nums[i];
            
            while(start < end) {
                
                if(nums[end] + nums[start] == req) {
                    
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[start]);
                    triplet.add(nums[end]);
                    ans.add(triplet);
                    
                    // remove duplicates from low and high
                    while(start < n-1 && nums[start] == nums[start+1]) start++;
                    while(end > start && nums[end] == nums[end-1]) end--;
                    start++;
                    end--;
                    
                }
                
                else if(nums[end] + nums[start] > req)
                    end--;
                else
                    start++;
                
                
                while(i < n-1 && nums[i] == nums[i+1]) i++;
                
            }
        }
       
        return ans;
    }
}