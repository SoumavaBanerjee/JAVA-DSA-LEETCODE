public class Solution {
    public void setZeroes(int[][] matrix) {
        
        int col = matrix[0].length;
        int row = matrix.length;
        
        boolean[] isZeroPresentInRow = new boolean[row];
        boolean[] isZeroPresentInCol = new boolean[col];
        
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                if(matrix[i][j] == 0) {
                    isZeroPresentInRow[i] = true;
                    isZeroPresentInCol[j] = true;
                }
                
        
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                if( isZeroPresentInRow[i] || isZeroPresentInCol[j] )
                    matrix[i][j] = 0;
        
    }     
}