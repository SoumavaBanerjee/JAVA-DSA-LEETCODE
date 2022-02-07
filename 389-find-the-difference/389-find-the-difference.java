class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length() == 0)
            return t.charAt(0);
        
        int sum = 0;
        
        for(char c1 : s.toCharArray())
            sum ^= (int) c1;
        
        for(char c2 : t.toCharArray())
            sum ^= (int) c2;
        
        return (char) sum;
    }
}