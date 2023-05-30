package com.company.Arrays;

import java.util.Objects;
import java.util.regex.Pattern;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {



        String[] arrS = s.split(""); //slow
        String[] arrT = t.split(""); //fast

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < arrS.length && j < arrT.length){
            if (Objects.equals(arrS[i], arrT[j]) ){
                System.out.println(arrS[i] + " == " + arrT[j]);
                sb.append(arrT[j]);
               i++;
               j+=i;
            }else {
                System.out.println(arrS[i] + " ROZNE " + arrT[j]);
               j++;
            }
        }


        System.out.println(sb);
        System.out.println(s);

         return String.valueOf(sb).equals(s);
    }

    //DUZO LEPSZE ROZWIAANIE
    public static boolean isSubsequenceCHINCZYK(String s, String t) {

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            System.out.println(s.charAt(i) + " " + t.charAt(j));
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++; //tu nie ma else zawsze jest j++ zwiekszane zeby byla zachowana wzgledna kolejnosc
        }
        return i== s.length();
    }
}

/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */