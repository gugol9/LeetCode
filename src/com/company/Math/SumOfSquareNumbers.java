package com.company.Math;

public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {

        int sqrt = (int) Math.sqrt(c);

        for (int i = 0; i <= sqrt; i++) {
            int b = (int) Math.sqrt(c - i * i);

            if (i * i + b * b == c) {
                System.out.println(i + "^2 + " + b + "^2 = " + c);
                return true;
            }
        }

        return false;
    }
}