class Solution {
    
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n];
        
        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return util(0,0,m,n, dp);
    }
    
    
    public int util(int startRow,int startCol,int endRow,int endCol,int[][] dp) {
        
        if(startRow == endRow - 1 && startCol == endCol - 1) {
            return 1;
        }
        
        else if(startRow >= endRow || startCol >= endCol )
            return 0;        
        
        else if (dp[startRow][startCol] != -1)
            return dp[startRow][startCol];
        
        else
            return dp[startRow][startCol] =  util(startRow + 1, startCol, endRow, endCol,dp) + util(startRow, startCol + 1, endRow, endCol,dp);
        
    }
    
}