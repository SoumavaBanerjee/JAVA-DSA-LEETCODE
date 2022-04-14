public class Solution {
    public void setZeroes(int[][] matrix) {
       
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int i=0; i<n; i++){
            if(matrix[0][i]==0){
                firstRowHasZero = true;
                break;
            }
        }

        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){
                firstColHasZero = true;
                break;
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }



        for(int j=1;j<n; j++){
            if(matrix[0][j]==0){
                nullifyCol(matrix, j, m, n);
            }
        }

        for(int i=1; i<m; i++){
            if(matrix[i][0]==0){
                nullifyRow(matrix, i, m, n);
            }
        }

        if(firstRowHasZero){
            nullifyRow(matrix, 0, m, n);
        }
        if(firstColHasZero){
            nullifyCol(matrix, 0, m, n);
        }

    }

    public void nullifyRow(int[][] matrix, int i, int m, int n){
        for(int col=0; col<n; col++){
            matrix[i][col] = 0;
        }
    }

    public void nullifyCol(int[][] matrix, int j, int m, int n){
        for(int row=0; row<m; row++){
            matrix[row][j] = 0;
        }
    }
}