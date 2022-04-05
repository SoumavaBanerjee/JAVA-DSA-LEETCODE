class Solution {
    public int maxArea(int[] height) {
        
        int maxYet = 0;
        int start = 0;
        int end = height.length - 1;
        
        while(start < end) {
            
            int max = (end-start) * Math.min(height[start],height[end]);
            maxYet = Math.max(max,maxYet);
            
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        
        return maxYet;
    }
}