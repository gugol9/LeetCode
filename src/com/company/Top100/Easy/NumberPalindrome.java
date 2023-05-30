package com.company.Top100.Easy;

public class NumberPalindrome {
    public static boolean isPalindrome(int x) {

        String str1 = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str1).reverse();
        return str1.contentEquals(sb);


    }
}
