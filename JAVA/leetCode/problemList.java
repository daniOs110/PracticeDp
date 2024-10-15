class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] emptyArray = new int[0];
        int[] result = new int[nums.length];
        //base case
        if(nums.length == 0) return emptyArray;
        
        int position = 0;
        int multiplyRes;
        while(position < nums.length){
            multiplyRes = 1;
            for(int i = 0; i < nums.length; i++){
                if(position != i){
                    multiplyRes = nums[i] * multiplyRes;
                }
            }
            result[position] = multiplyRes;
            position++;
        }
        return result; 
    }
}