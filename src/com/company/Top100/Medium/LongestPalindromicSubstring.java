package com.company.Top100.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {

       // sprawdzic czy s == s.reverse() ;
        if (s.length() == 1) return String.valueOf(s.charAt(0));

        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j < s.length()+1; j++){


                String p = String.valueOf(new StringBuilder(s.substring(i,j)).reverse());
                if (s.substring(i, j).equals(p)){
                    list.add(s.substring(i,j));
                }
            }
        }
        System.out.println(list);


        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}