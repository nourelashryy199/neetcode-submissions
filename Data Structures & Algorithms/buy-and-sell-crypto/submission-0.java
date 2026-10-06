class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        for(int i = 0; i < prices.length; i++){
            int cursor = i + 1;
            int profit = 0;
            while(cursor < prices.length){
                profit = prices[cursor] - prices[i];
                maxP = Math.max(profit, maxP);
                cursor ++;
            }

        }
        return maxP;
    }
}
