package JAVA.leetCode.twoPointest;
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        //remove nmon alpha numeric BIg O(n) space copmplexity (1)
        //put everithing in lowercase
        //"amanaplanacanalpanama"
        //           -
        //           -
        // fi == li-> fi++ li--else return false
        // if(index are the same return true)
        String newString = s.toLowerCase();
        newString = newString.replaceAll("[^a-z0-9]", "");

        int firstIndex = 0;
        int lastIndex = newString.length() - 1;

        while(firstIndex <= lastIndex){
            if(newString.charAt(firstIndex) == newString.charAt(lastIndex)){
                firstIndex++;
                lastIndex--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
