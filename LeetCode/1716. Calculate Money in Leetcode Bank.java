// https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class Solution {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n) {
        int currentMoney = 1;
        int totalMoney = 0;

        for(int i = 0; i < n; i++) {
            if (i%7 == 0) {
                currentMoney = i/7 + 1;
            }
            totalMoney += currentMoney;
            currentMoney++;
        }

        return totalMoney;
    }
}
