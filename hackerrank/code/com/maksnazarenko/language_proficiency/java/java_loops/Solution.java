package com.maksnazarenko.language_proficiency.java.java_loops;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans = a;
            for (int it = 1; it<=n; it++) {
                ans += Math.pow(2, it-1) * b;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        in.close();
    }
}