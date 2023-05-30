package com.company.String;

public class StringToInteger {
    public static int myAtoi(String s) {

        s = s.trim();
        String resut = "";
        char[] charsArr = s.toCharArray();
        if (charsArr[0] != '-' || !Character.isDigit(charsArr[0])){
         return 0;
        }else
        for (int i = 0; i < charsArr.length; i++) {
            if (Character.isDigit(charsArr[i]) || charsArr[0] == '-') {
                resut += (charsArr[i]);
            }
        }
        return Integer.parseInt(resut);
    }
}

