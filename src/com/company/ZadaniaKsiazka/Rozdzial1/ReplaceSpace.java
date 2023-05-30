package com.company.ZadaniaKsiazka.Rozdzial1;

import java.util.Arrays;
import java.util.Objects;

public class ReplaceSpace {

    public static String replaceSpacec(String str){

        String[] arr = str.trim().split("");

        for (int i = 0; i < arr.length ;i++){
            if (Objects.equals(arr[i], " "))
                arr[i] = "%20";
        }
        str = String.join("",arr);
        return str;
    }
}
