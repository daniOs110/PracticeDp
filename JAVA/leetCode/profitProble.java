class Solution {
    public int maxProfit(int[] prices) {

        //base case
        if(prices == null || prices.length < 2){
            return 0;
        }
    
        int buy = prices[0];
        int maxProfit = 0;

        int j = 0; 
        for(int i=0; i < prices.length; i++){
           if(prices[i] < buy){
            buy = prices[i];
           } else{
            int profit = prices[i] - buy;
            maxProfit = Math.max(maxProfit, profit);
           }
        }
        return maxProfit;
    }
}