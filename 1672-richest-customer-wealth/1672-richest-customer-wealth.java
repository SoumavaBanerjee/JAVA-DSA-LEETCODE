class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m = accounts.length;
        int n = accounts[0].length;
        
        int maxWealth = -1;
        
        for(int i=0; i<m; i++) {
            int currWealth = 0;
            
            for(int j=0; j<n; j++) {
                currWealth += accounts[i][j];
            }
        
            if(currWealth > maxWealth)
                maxWealth = currWealth;
        }
            
        return maxWealth;
    }
}