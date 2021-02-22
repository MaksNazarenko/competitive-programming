package com.maksnazarenko.problem_solving.algorithms.staircase;

import java.util.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int blank = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (blank > j) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("#");
                }
            }
            blank--;
            System.out.printf("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
