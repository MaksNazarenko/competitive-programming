package com.maksnazarenko.language_proficiency.java.duplicate_word;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)*";/* Write a RegEx matching repeated words here. */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0)/* The regex to replace */, m.group(1)/* The replacement. */);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}