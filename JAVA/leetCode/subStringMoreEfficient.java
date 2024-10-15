class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0; int j = 0;
        while(i < word1.length() && j < word2.length()){
            merged.append(word1.charAt(i));
            i++;
            merged.append(word2.charAt(j));
            j++;
        }       

        while(i < word1.length()){
            merged.append(word1.charAt(i));
            i++;
        } 
        
        while(j < word2.length()){
            merged.append(word2.charAt(j));
            j++;
        } 

        return String.valueOf(merged);
    }
}