package com.company.Code;

import java.util.Arrays;

//odwrocenie ciagu bez StringBuildera
public class ReverseString {
    public static String reverseString(String str){

        String [] arr = str.split("");
        String [] arrStr = new String[arr.length];
        StringBuilder sb = new StringBuilder();

        int i = 0, j = arr.length-1;
        while (i < arr.length){
            arrStr[i] = arr[j];
            sb.append(arrStr[i]);
            i++;
            j--;
        }

        return String.valueOf(sb);

    }
}
