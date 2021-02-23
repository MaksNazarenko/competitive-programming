package com.maksnazarenko.language_proficiency.java.java_bitset;

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
        int m = scanner.nextInt();
        BitSet[] bitSet = new BitSet[2];
        for (int i = 0; i < 2; i++) {
            bitSet[i] = new BitSet(n);
        }

        while (m-- > 0) {
            String operation = scanner.next();
            int set = scanner.nextInt();
            int setOrIndex = scanner.nextInt();
            switch (operation) {
                case "AND":
                    bitSet[set - 1].and(bitSet[setOrIndex - 1]);
                    break;
                case "OR":
                    bitSet[set - 1].or(bitSet[setOrIndex - 1]);
                    break;
                case "XOR":
                    bitSet[set - 1].xor(bitSet[setOrIndex - 1]);
                    break;
                case "FLIP":
                    bitSet[set - 1].flip(setOrIndex);
                    break;
                case "SET":
                    bitSet[set - 1].set(setOrIndex);
                    break;
            }

            System.out.println(bitSet[0].cardinality() + " " + bitSet[1].cardinality());
        }
    }
}