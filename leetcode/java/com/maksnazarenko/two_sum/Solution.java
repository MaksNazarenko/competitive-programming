package com.maksnazarenko.two_sum;

import java.util.Arrays;

/*
https://leetcode.com/problems/two-sum/
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * Brute force
     * @param nums array of integers
     * @param target integer
     * @return indices of the two numbers such that they add up to target
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
