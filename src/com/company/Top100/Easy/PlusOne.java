package com.company.Top100.Easy;

public class PlusOne {
    public static int[] plusOne(int[] digits) {



        int n = digits.length;
        for (int i = n-1; i >= 0; i--){
            if (digits[i] < 9 ) {
                digits[i] = digits[i] + 1;
                return digits;
            }else digits[i] = 0; //ustawia na zero i zwrocic moze tylko warunek if a nie else [9,9] ustawi na [0,0]
        }


        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;

    }
}

