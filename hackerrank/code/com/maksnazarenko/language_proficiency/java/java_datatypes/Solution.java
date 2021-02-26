package com.maksnazarenko.language_proficiency.java.java_datatypes;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                if(x<Long.MIN_VALUE && x>Long.MAX_VALUE) {
                    System.out.println(x + " can't be fitted anywhere.");
                } else {
                    System.out.println(x+" can be fitted in:");
                }
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
