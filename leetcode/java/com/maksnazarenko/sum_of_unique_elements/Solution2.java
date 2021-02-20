package com.maksnazarenko.sum_of_unique_elements;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println(sumOfUnique(new int[]{10,4,10,9,5}));
    }

    public static int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        int ans = 0;
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ans += i;
            }
        }
        return ans;
    }
}
