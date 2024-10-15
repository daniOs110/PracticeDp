class Solution {
    public String longestCommonPrefix(String[] strs) {
        //base case
        if(strs.length == 0) return ""; 
        if(strs.length == 1) return strs[0];

        int minLength = strs[0].length();

        for(String str : strs){
            if(str.length() < minLength){
                minLength = str.length();
            }
        }    
     
        int position = 0;
        while (position < minLength){ 
            for(String str :  strs){
                if(str.charAt(position) != strs[0].charAt(position)){
                    return strs[0].substring(0, position);
                }
            }
            position ++;
        }
        return strs[0].substring(0, position);

    }
}
