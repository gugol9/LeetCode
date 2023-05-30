package com.company.Math;

//dzielenie dwoch intow bez uzywania dzieleai
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        int count = 0;

        while (dividend >= divisor){
            dividend-=divisor;
            count++;
        }
        return count;
    }
}