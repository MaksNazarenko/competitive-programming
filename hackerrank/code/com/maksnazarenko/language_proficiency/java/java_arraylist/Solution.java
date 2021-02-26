package com.maksnazarenko.language_proficiency.java.java_arraylist;

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
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int length = scanner.nextInt();
            List<Integer> subList = new ArrayList<>();
            while (length-- > 0) {
                subList.add(scanner.nextInt());
            }
            mainList.add(subList);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            try {
                int ans = mainList.get(x).get(y);
                System.out.println(ans);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}