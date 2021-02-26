package com.maksnazarenko.language_proficiency.java.java_list;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        while (q-- > 0) {
            if (scanner.next().equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        for (Integer value:list) {
            System.out.print(value + " ");
        }

    }
}