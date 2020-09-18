//1. brute force
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int cur = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if(prices[j] > prices[i]){
                    cur = prices[j] - prices[i];
                }
                if(cur > ans){
                    ans = cur;
                }
            }
        }
        return ans;
    }
}