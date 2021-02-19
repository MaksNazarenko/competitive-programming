package com.maksnazarenko.running_sum_of_1d_array;

/*
 https://leetcode.com/problems/running-sum-of-1d-array/
 */

public class Solution {
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(runningSum(test));
    }

    public static int[] runningSum(int[] nums) {
        int running = 0;
        for (int i = 0; i < nums.length; i++) {
            running += nums[i];
            nums[i] = running;
        }
        return nums;
    }
}