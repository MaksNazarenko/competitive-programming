package com.maksnazarenko.language_proficiency.java.java_1d_array;

import java.util.*;

public class Solution2 {

    public static boolean canWin(int leap, int[] game, int index) {
        // Return true if you can win the game; otherwise, return false.
        if (index < 0 || game[index] == 1) {
            return false;
        }
        if (index >= game.length - 1|| index + leap >= game.length) {
             return true;
        }
        game[index] = 1;
        return canWin(leap, game, index + leap)
                || canWin(leap, game, index + 1)
                || canWin(leap, game, index - 1);
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

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}