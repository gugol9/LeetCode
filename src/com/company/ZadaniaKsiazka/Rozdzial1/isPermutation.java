package com.company.ZadaniaKsiazka.Rozdzial1;

import java.util.Arrays;

public class isPermutation {

    public static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }



    public static boolean isPermutation(String s1, String s2){
        if( s1.length() == s2.length()){
          return   sort(s1).equals(sort(s2));
        }
        return false;
    }
}
