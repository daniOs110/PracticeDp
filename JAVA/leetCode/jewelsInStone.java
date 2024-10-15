class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>(); 
        int count = 0;

        for(char jew : jewels.toCharArray()){
            jewelsSet.add(jew);
        }
        for(char stn : stones.toCharArray()){
            if(jewelsSet.contains(stn)){
                count++;
            }
        }
        return count;
      
    }
}