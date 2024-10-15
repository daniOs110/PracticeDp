class Solution {
    public String mergeAlternately(String word1, String word2) {

        HashMap<Integer, Character> map1 = new HashMap<>();
        HashMap<Integer, Character> map2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){
            char letter = word1.charAt(i);
            map1.put(i,letter);
        }
         for(int i = 0; i < word2.length(); i++){
            char letter2 = word2.charAt(i);
            map2.put(i,letter2);
        }
        String merged = "";
        Set<Integer> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        for(int key : allKeys){
            if(map1.containsKey(key)){
                merged += map1.get(key);
            }
            if(map2.containsKey(key)){
                merged += map2.get(key);
            }
        }
        return merged;

    }
}