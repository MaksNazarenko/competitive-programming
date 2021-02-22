package com.maksnazarenko.language_proficiency.java.java_end_of_file;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (scanner.hasNext()) {
            number++;
            System.out.println(number + " " + scanner.nextLine());
        }
        scanner.close();
    }
}