class twoSumProblemsBestSol {
    public int[] twoSum(int[] numbers, int target) {
        // [2,7,11,15]
        //  -
        //          -
        // target = 9  = 17
        // LI + FI = TARGET ? if sum > target pass
        // FI > Target -> pass to the previous 
        // LI > Target -> next number
        int [] result = new int[2];
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        while(firstIndex <= lastIndex){
            int sum = numbers[firstIndex] + numbers[lastIndex];
            if(sum > target){
                lastIndex--;
            }else
            if(sum < target){
                firstIndex++;
            }else
            if(sum == target){
                result[0] = firstIndex + 1;
                result[1] = lastIndex + 1;
                return result;
            }
        }
        return result;
    }
}