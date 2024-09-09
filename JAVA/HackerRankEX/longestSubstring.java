//I will recibe a String with a length of n
// And I will need to return the length of the substring most large 
package JAVA.HackerRankEX;

import java.util.HashMap;

/**
 * longestSubstring
 */
    //seria separar la palabra una por una 
    // guardarla en un hashmap donde la clave sera la posicion de la palabra y el valor la palabra 
    //finalmente iniciar la cuenta de la palabra antes de que se repita
      
public class longestSubstring {

    public static int lengthString(String inputString){
        //new char[inputString.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        int lenghtWord = inputString.length();
        // ArrayList<Character> wordArray = new ArrayList<>();
        int position = 0;
        int count = 0;
        //pwwkew
        for (int i = 0; i < lenghtWord; i++) {
            Character currentlyLetter = inputString.charAt(i);
            // wordArray.add(currentlyLetter);
            if(position == lenghtWord){
                return count;
            }
            if (map.containsKey(currentlyLetter)) {
                map.remove(currentlyLetter);
                position ++;
            }else{
                count ++;
                map.put(currentlyLetter, i);
            }
            position ++;
        }

        return count;
    } 

    public static void main(String[] args) {
        String input = "pwwkew";
        int result = lengthString(input);

        System.out.println("Longest subString is "+ result);
    }
}