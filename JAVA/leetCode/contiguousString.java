class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(j < t.length()){
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                i++; //avanza en s
            }
            j++; //avanza en t(siempre)
        }
        return i == s.length();
    }  
}