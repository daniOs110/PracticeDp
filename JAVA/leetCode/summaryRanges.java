class Solution {
    public List<String> summaryRanges(int[] nums) {
        
       
        // [0,2,3,4,6,8,9]
        int iPosition = 0;
        int fPosition = 0;
        List<String> output = new ArrayList();
        
        for(int i = 0; i < nums.length; i++){
            if( i+1 < nums.length && (nums[i] + 1) == nums[i + 1]){
                fPosition++;
            }else if(iPosition == fPosition){
                output.add(String.valueOf(nums[iPosition]));
                iPosition++;
                fPosition++;
            }else{
                output.add(String.valueOf(nums[iPosition]) + "->" + String.valueOf(nums[fPosition]));
                iPosition = fPosition + 1;
                fPosition ++;
            }
        }
        return output; 
    }
}