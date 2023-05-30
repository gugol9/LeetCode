package com.company.String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String sReverse = String.valueOf(new StringBuilder(s).reverse());

        return s.equals(sReverse);


}
}

