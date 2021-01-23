// https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int cur = 0;
        for (int i = 0; i < gain.length; i++) {
            cur += gain[i];
            if (ans < cur) {
                ans = cur;
            }
        }
        return ans;
    }
}
