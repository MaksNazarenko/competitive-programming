package com.maksnazarenko.language_proficiency.java.java_negative_subarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int runningSum = 0;
            for (int j = i; j < n; j++) {
                runningSum = arr[j] + runningSum;
                if (runningSum < 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}