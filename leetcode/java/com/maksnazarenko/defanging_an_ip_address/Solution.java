package com.maksnazarenko.defanging_an_ip_address;

/*
https://leetcode.com/problems/defanging-an-ip-address/
 */
public class Solution {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";

        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr(address).equals(expected));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
