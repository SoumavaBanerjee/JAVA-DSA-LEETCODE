class Solution {
    public int minDeletions(String s) {
        
        int ans = 0;
        int[] freq = new int[26];
        
        for(char c : s.toCharArray())
            freq[c - 'a']++;
        
        Set<Integer> hashset = new HashSet<Integer>();
        for(int i = 0; i < 26; i++) {
            while(freq[i] > 0 && !hashset.add(freq[i])) {
                
                freq[i]--;
                ans++;
            }
        }
        
        return ans;
    }
}