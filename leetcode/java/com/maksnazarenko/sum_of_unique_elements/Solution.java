package com.maksnazarenko.sum_of_unique_elements;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println(sumOfUnique(new int[]{10,4,10,9,5}));
    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 2);
            } else {
                map.put(num, 1);
            }
        }

        int ans = 0;
        for (int num:nums) {
            if (map.get(num) == 1) {
                ans += num;
            }
        }
        return ans;
    }
}
