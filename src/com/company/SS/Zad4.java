package com.company.SS;

public class Zad4 {

    public static int getMaxDiv(int num){
        for (int i = num/2; i > 0; i--){
            if (num % i == 0 && i % 2 != 0)return i;
        }
        return 1;
    }

    public static int getMaxDivRek(int num){
        if (num % 2 != 0)
            return num;
        else
            return getMaxDivRek(num/2);
    }

    public static void soutGetMaxDiv(int num){
        System.out.println(getMaxDiv(num));
        System.out.println(getMaxDivRek(num));
    }

}
