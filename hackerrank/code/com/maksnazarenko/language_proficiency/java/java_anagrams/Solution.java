package com.maksnazarenko.language_proficiency.java.java_anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] charsA = new char[a.length()];
        char[] charsB = new char[b.length()];
        for (int i = 0; i < a.length(); i++) {
            charsA[i] = a.charAt(i);
            charsB[i] = b.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 1; j < a.length(); j++) {
                if (charsA[i] > charsA[j]) {
                    char temp = charsA[i];
                    charsA[i] = charsA[j];
                    charsA[j] = temp;
                }
                if (charsB[i] > charsB[j]) {
                    char temp = charsB[i];
                    charsB[i] = charsB[j];
                    charsB[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (charsA[i] != charsB[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
