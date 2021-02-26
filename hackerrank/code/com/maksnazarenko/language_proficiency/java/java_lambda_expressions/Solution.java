package com.maksnazarenko.language_proficiency.java.java_lambda_expressions;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

//code below------------------------------------------------
    public static PerformOperation isPalindrome() {
        return num -> {
            String toCheck = String.valueOf(num);
            for (int i = 0; i < toCheck.length() / 2; i++) {
                if (toCheck.charAt(i) != toCheck.charAt(toCheck.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isOdd() {
        return num -> (num & 1) == 1;
    }

    public PerformOperation isPrime() {
        return num -> {
            if (num < 2) return false;
            int sqrt = (int) Math.sqrt(num);
            for (int i = 2; i < sqrt; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }
}
//code above------------------------------------------------

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

