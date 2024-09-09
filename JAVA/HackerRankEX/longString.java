package JAVA.HackerRankEX;

import java.util.HashSet;

public class longString {
    public static int lengthString(String inputString){
        HashSet <Character> wordHash = new HashSet<>();

        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < inputString.length(); right++){
            Character word = inputString.charAt(right);
            //base case
            while (wordHash.contains(word)) {
                wordHash.remove(inputString.charAt(left));
                left ++;
            }
            wordHash.add(word);

            maxLength = Math.max(maxLength, (right - left) + 1);
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        String input = "pwwkew";
        int result = lengthString(input);

        System.out.println("Longest subString is "+ result);
    }
}