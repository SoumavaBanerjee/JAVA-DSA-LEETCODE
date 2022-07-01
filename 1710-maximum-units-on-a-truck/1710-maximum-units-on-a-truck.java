class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        
        int maxUnits = 0;
        for(int[] box : boxTypes) {
            
            if(truckSize > box[0]) {
                maxUnits = maxUnits + (box[0] * box[1]);
                truckSize = truckSize - box[0]; 
            } else {
                maxUnits = maxUnits + truckSize * box[1];
                return maxUnits;
            }
           
        }
        
        return maxUnits;
    }
}