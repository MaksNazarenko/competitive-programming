package com.maksnazarenko.language_proficiency.java.java_1d_array;

import java.util.*;

/**
 * Pass 5/10 tests
 */
public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (game == null) {
            return false;
        }
        int i = 0;
        while(true) {
            if (game[i] == 1) {
                return false;
            }
            game[i] = 1;
            if (i+leap >= game.length) {
                return true;
            } else if (game[i+leap] == 0) {
                i = i + leap;
            } else if (game[i+1] == 0) {
                i++;
            } else if (i-1 > 0 && game[i-1] == 0) {
                i--;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
