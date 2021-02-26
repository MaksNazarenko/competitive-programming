package com.maksnazarenko._30_days_of_code.day_6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int repeats = sc.nextInt();
        sc.nextLine();
        while (repeats-- > 0) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            String in = sc.nextLine();
            for(int i = 0; i < in.length(); i++) {
                if (i % 2 != 0) {
                    even.append(in.charAt(i));
                } else {
                    odd.append(in.charAt(i));
                }
            }
            System.out.println(odd.toString() + " " + even.toString());
        }
    }
}
