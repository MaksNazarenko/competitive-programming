package com.maksnazarenko.problem_solving.algorithms.time_conversion;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time = s.split(":");
        String amPm = time[2].substring(2);

        int hh = Integer.parseInt(time[0]);

        StringBuilder sb = new StringBuilder();

        if (amPm.equals("AM")) {
            if (hh == 12) {
                hh = 0;
            }
            sb.append("0");
        } else {
            if (hh != 12) {
                hh += 12;
            }
        }

        return sb.append(hh).append(':').append(time[1]).append(':').append(time[2], 0, 2).toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
