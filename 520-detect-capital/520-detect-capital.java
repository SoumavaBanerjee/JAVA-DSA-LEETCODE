class Solution {
    
    static boolean isStringUpperCaseEqual(String word) {
        return word.equals(word.toUpperCase());
    }
    
    static boolean isStringLowerCaseEqual(String word) {
        return word.equals(word.toLowerCase());
    }
    
    public boolean detectCapitalUse(String word) {
        
        if(word.length() == 1) return true;
        
        return Character.isUpperCase(word.charAt(0)) 
            ? isStringUpperCaseEqual(word.substring(1)) || isStringLowerCaseEqual(word.substring(1))
            : isStringLowerCaseEqual(word.substring(1));
        
    }
}