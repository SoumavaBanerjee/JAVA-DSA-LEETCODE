class Solution {
    public int[][] generateMatrix(int n) {
        int cnt = 1;
        int[][] matrix = new int[n][n];
        
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = n-1;
        
        
        while(sr <= er && sc <= ec) {
            for(int i = sc; i <= ec; i++)
                matrix[sr][i] = cnt++;
            sr++;
            
            for(int i = sr; i <= er; i++)
                matrix[i][ec] = cnt++;
            ec--;
            
            if(sr < er && sc < ec) {
                for(int i = ec; i >= sc; i--)
                    matrix[er][i] = cnt++;
                er--;

                for(int i = er; i >= sr; i--)
                    matrix[i][sc] = cnt++;
                sc++;
            }
              
        }
        
        return matrix;
        
        
    }
}