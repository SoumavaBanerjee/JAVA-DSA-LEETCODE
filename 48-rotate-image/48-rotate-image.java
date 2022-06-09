class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        // transpose the matrix
        transpose(matrix, row, col);
        
        
        // reverse each row
        for(int i = 0; i < col; i++){
           int start = 0;
           int end = col - 1;
            
           while(start < end) {
               swap(matrix, i, start++, end--);
           }
        }
        
    }
    
    private void transpose(int[][] matrix, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = i; j < col; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    
    private void swap(int[][] matrix, int i, int index1, int index2 ) {
        int temp = matrix[i][index2];
        matrix[i][index2] = matrix[i][index1];
        matrix[i][index1] = temp;
    }
}