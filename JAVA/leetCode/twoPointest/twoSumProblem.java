class twoSumProblem {
    public int[] twoSum(int[] numbers, int target) {
        // [2,7,11,15]
        //  -
        //          -
        // target = 9  = 17
        // LI + FI = TARGET ? if sum > target pass
        // FI > Target -> pass to the previous 
        // LI > Target -> next number
        int [] result = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int firstIndex = i;
            for(int j = i+1; j < numbers.length; j++){
                int lastIndex = j;
                int sum = numbers[firstIndex] + numbers[lastIndex];
                if(sum > target){
                    break;
                }else if(sum == target){
                    result[0] = firstIndex + 1;
                    result[1] = lastIndex + 1;
                    return result;
                }
            }
        }
        return result;
    }
}