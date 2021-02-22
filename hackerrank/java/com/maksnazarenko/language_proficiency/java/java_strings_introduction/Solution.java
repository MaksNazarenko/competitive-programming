package com.maksnazarenko.language_proficiency.java.java_strings_introduction;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.replace(A.charAt(0), A.toUpperCase().charAt(0) ) + " " + B.replace(B.charAt(0), B.toUpperCase().charAt(0)));
    }
}
