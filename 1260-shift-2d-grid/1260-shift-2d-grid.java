class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;
        
        List<List<Integer>> resultGrid = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < m; i++) {
            List<Integer> calcRow = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                int shiftedIndex = calcShiftedIndex(i,j,n,k,total);
                calcRow.add(grid[shiftedIndex / n][shiftedIndex % n]);
            }
            resultGrid.add(calcRow);
        }
        
        return resultGrid;
    }
    
    private static int calcShiftedIndex(int i, int j, int n, int k, int total) {
        return (i * n + j + total - k) % total;
    }
}