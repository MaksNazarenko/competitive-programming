package com.maksnazarenko.running_sum_of_1d_array;

/*
 https://leetcode.com/problems/running-sum-of-1d-array/
 */

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(test)));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
