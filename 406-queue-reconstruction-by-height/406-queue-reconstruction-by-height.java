class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        ArrayList<int[]> ans = new ArrayList<int[]>();
    
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        
        for(int[] a : people) {
            ans.add(a[1],a);
        }
        
        return ans.toArray(new int[0][]);
            
    }
}