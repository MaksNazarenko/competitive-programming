package com.maksnazarenko.language_proficiency.java.java_md5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String in = sc.nextLine();
        byte[] bytes = md5.digest(in.getBytes());

        for (byte b:bytes) {
            System.out.printf("%02x",b);
        }
    }
}