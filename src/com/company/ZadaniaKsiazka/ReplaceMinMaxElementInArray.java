package com.company.ZadaniaKsiazka;

import java.util.Arrays;

public class ReplaceMinMaxElementInArray {


    public static int findMinElement(int[] arr){
         int min = Integer.MAX_VALUE;
         int positionMin = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                positionMin = i;
            }
        }
        //zwraca min wartosc
        return positionMin;
    }

    public static int findMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int positionMax = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                positionMax = i;
            }
        }
        return positionMax;
    }

    public static void swap(int[] arr, int max, int min){
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
    }

    public static void replaceMinMax(int[] arr){
       int max = findMaxElement(arr);
       int min = findMinElement(arr);
       swap(arr,max,min);
        System.out.println(Arrays.toString(arr));
    }

}
