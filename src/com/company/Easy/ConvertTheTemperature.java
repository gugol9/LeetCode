package com.company.Easy;

public class ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {

        double[] arr = new double[2];
        arr[0] = Math.round((celsius+273.15) * 100000.0)/100000.0;
        arr[1] = Math.round((celsius * 1.80 + 32.00) * 100000.0)/100000.0;

        return arr;
    }
}