class Solution {
    public int minPartitions(String n) {
        int maxPartition = 0;
        
        for(String s : n.split("")) {
            maxPartition = Math.max(maxPartition,Integer.parseInt(s));
        }
        
        return maxPartition;
    }
}