package com.company.Code;

import java.util.Arrays;

public class AmstrongNumber {

    public  static boolean isAmstrongNumber(int number){

        String[] arrSt = String.valueOf(number).split("");

        int[] arr = Arrays.stream(arrSt)
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;

        for (int i = 0; i < arr.length; i++){
            result += Math.pow(arr[i], 3);
        }
        return result == number;
    }


}
