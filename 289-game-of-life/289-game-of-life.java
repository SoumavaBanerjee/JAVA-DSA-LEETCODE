class Solution {
    
    private static int[][] directions = new int[][] {{0,1},{1,0},{0,-1},{-1,0},{-1,1},{1,-1},{-1,-1},{1,1}};
    
    public void gameOfLife(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
        
                    int activeNeighbour = getActiveNeighbour(board, i ,j);            
                    if(activeNeighbour < 2 || activeNeighbour > 3)
                        board[i][j] = -2;
                    
                } else if (board[i][j] == 0) {
                    
                    int activeNeighbour = getActiveNeighbour(board, i ,j);
                    if(activeNeighbour == 3)
                        board[i][j] = 3;
                }
            }
        }
        
        updateBoard(board);
        return;
    }
    
    
    private static void updateBoard(int[][] board){
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
               if(board[i][j] == -2)
                   board[i][j] = 0;
                
                if(board[i][j] == 3)
                    board[i][j] = 1;
            }   
        }
        
        return;
    }
    
    private int getActiveNeighbour(int[][] board, int row, int col) {
        int activeN = 0;
        
        for(int[] direction : directions) {
            int newRow = direction[0] + row;
            int newCol = direction[1] + col;
            
            if((newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && (board[newRow][newCol] == 1 || board[newRow][newCol] == -2)))                            activeN++;
            
        }
        
        return activeN;
    }
}