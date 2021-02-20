package com.maksnazarenko.reverse_integer;

/*
https://leetcode.com/problems/reverse-integer/
 */
public class Solution {
    public static void main(String[] args) {
        int x = 1534236469;
        int expected = 0;

        int x2 = -2147483412;
        int expected2 = -2143847412;

        int x3 = 123;
        int expected3 = 321;

        System.out.println(reverse(x) + " = " + expected);
        System.out.println(reverse(x2) + " = " + expected2);
        System.out.println(reverse(x3) + " = " + expected3);
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int add = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE / 10
                    || ans == Integer.MAX_VALUE / 10
                    && add > 7) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10
                    || ans == Integer.MIN_VALUE / 10
                    && add < -8) {
                return 0;
            }
            ans = ans * 10 + add;
        }
        return ans;
    }
}
