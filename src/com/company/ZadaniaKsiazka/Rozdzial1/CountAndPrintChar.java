package com.company.ZadaniaKsiazka.Rozdzial1;

import java.util.Objects;

public class CountAndPrintChar {

    public static String countChar(String str){

        String [] arr = str.split("");
        int counter = 1;
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < arr.length-1; i++){
            if (Objects.equals(arr[i+1], arr[i])){
                counter++;
            }else {
                System.out.println(arr[i]);
                result.append(arr[i]).append(counter);
                counter = 1;
            }
        }
        //added last value with count
        result.append(arr[arr.length - 1]).append(counter);
        return result.toString();
    }
}
