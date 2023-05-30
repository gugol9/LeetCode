package com.company.Top100.Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {


      Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        int i =0;
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];

        while (i < firstWord.length() && i < lastWord.length()){
            if (firstWord.charAt(i) == lastWord.charAt(i)){
                i++;
            }else
                break;
        }
        return firstWord.substring(0,i);
    }
}