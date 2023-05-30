package com.company.Math;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {

        double sqrt = Math.sqrt(num);

        if ((int)sqrt == sqrt)return true;
        else return false;
    }
}