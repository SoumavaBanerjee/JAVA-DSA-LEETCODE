class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        
        for(int i = 0, j = 0; i < s.length() && j < t.length(); j++) {
            
            if(s.charAt(i) == t.charAt(j)) {
                count++;
                i++;
            }
                
        }
        
        return count == s.length();
    }
}