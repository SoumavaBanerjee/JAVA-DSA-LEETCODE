class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       ///We will use sliding window template
       
       ArrayList<Integer> soln = new ArrayList<Integer>();
       
       //Check for bad input
       if (s.length() == 0 || p.length() == 0 || s.length() < p.length()){
           return new ArrayList<Integer>();
       }
       
       //Set up character hash
       //Keep track of how many times each character appears
       int[] chars = new int[26];
       for (Character c : p.toCharArray()){
           //Increment to setup hash of all characters currently in the window
           //Later on, these get DECREMENTED when a character is found
           //A positive count later on means that the character is still "needed" in the anagram
           //A negative count means that either the character was found more times than necessary
           //Or that it isn't needed at all
           chars[c-'a']++;
       }
       
       //Start = start poniter, end = end pointer,
       //len = length of anagram to find
       //diff = length of currently found anagram. If it equals
       //the length of anagram to find, it must have been found
       int start = 0, end = 0, len = p.length(), diff = len;
       
       char temp;
       //Before we begin this, the "window" has a length of 0, start and
       //end pointers both at 0
       for (end = 0; end < len; end++){
           //Process current char
           temp = s.charAt(end);
           
           //As discussed earlier, decrement it
           chars[temp-'a']--;
           
           //If it's still >= 0, the anagram still "needed" it so we count it towards the anagram by
           //decrementing diff
           if (chars[temp-'a'] >= 0){
               diff--;
           }
       }
       
       //This would mean that s began with an anagram of p
       if (diff == 0){
           soln.add(0);
       }
       
       //At this point, start remains at 0, end has moved so that the window is the length of the anagram
       //from this point on we are going to be moving start AND end on each iteration, to shift the window
       //along the string
       while (end < s.length()){
           
           //Temp represents the current first character of the window. The character that is
           //going to be "left behind" as the window moves. 
           temp = s.charAt(start);
           
           //If it's not negative, this means that the character WAS part of the anagram. That means we
           //are one step "farther away" from completing an anagram. So we must increment diff.
           if (chars[temp-'a'] >= 0){
               diff++;
           }
           
           //Increment the hash value for this character, because it is no longer contained in the window
           chars[temp-'a']++;
           
           //Increment start to start shifting the window over by 1
           start++;
           
           //Temp represents the last character of the window, the "new" character from the window shift.
           //This character "replaces" the one we removed before so the window stays the same length (p.length())
           temp = s.charAt(end);
           
           //Decrement hash value for this character, because it is now a part of the window
           chars[temp-'a']--;
           
           //Again, if it's not negative it is part of the anagram. So decrement diff
           if (chars[temp-'a'] >= 0){
               diff--;
           }
           
           //If diff has reached zero, that means for the last p.length() iterations, diff was decremented and
           //NOT decremented, which means every one of those characters was in the anagram, so it must be an anagram
           
           //Note: If many windows in a row find anagrams, then each iteration will have diff incremented then decremented again
           if (diff == 0){
               soln.add(start);
           }
           
           //Increment for next iteration
           end++;
           
       }
       
       return soln;
       
       
    }
}