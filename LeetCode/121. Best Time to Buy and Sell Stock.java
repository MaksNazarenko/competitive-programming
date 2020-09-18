//1. brute force
// O(n^2) time
// O(1) space
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

//2. one path
// O(n) time
// O(1) space
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}