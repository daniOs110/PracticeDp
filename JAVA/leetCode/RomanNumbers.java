class Solution {
    public int romanToInt(String s) {
        //debemos tener una jerarquia 
        //si s[0] < s[1] entonces se restan
        //si s[0] > s[1] entonces se suman
        HashMap<Character,Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int outputResult = 0;
        for(int i = 0; i < s.length(); i++){
           int currentValue = romanNumbers.get(s.charAt(i));
            if(i + 1 < s.length() && currentValue < romanNumbers.get(s.charAt(i+1))){
                outputResult -= currentValue;
            } else{
                outputResult += currentValue;
            }
        }
        return outputResult;
    }
}