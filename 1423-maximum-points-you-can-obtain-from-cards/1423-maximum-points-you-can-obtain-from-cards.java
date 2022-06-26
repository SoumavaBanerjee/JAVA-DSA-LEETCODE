class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int window = n - k;
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        
        for(int point : cardPoints)
            totalSum += point;
        
        if(k >= cardPoints.length)
            return totalSum;
        
        int[] prefix = new int[n];
        
        prefix[0] = cardPoints[0];
        for(int i = 1; i < prefix.length; i++)
            prefix[i] = cardPoints[i] + prefix[i-1];
        
    
        for(int i = 0, j = window-1; j < n && i < n; i++,j++) {
            if(i == 0)
                maxSum = totalSum - prefix[j];
            else
                maxSum = Math.max(maxSum , totalSum - (prefix[j] - prefix[i-1]));
                
        }
        
        return maxSum;
    }
}