package com.maksnazarenko.language_proficiency.java.java_bigdecimal;

import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < n; i++) {
            //inserting string values to BigDecimal
            BigDecimal left = new BigDecimal(s[i]);
            int index = i;
            for (int j = i + 1; j < n; j++) {
                //second BigDecimal to compare the first BigDecimal
                BigDecimal right = new BigDecimal(s[j]);

                //comparing if left element is greater that right element
                //if the left element is greater than right element than compareTo() returns 1
                if (right.compareTo(left) > 0) {
                    left = right;
                    index = j;
                }
            }

            //temporary variable to store s[i] value
            String temp = s[i];
            s[i] = s[index];
            s[index] = temp;
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}