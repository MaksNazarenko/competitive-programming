package com.maksnazarenko.language_proficiency.java.java_exception_handling_try_catch;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}