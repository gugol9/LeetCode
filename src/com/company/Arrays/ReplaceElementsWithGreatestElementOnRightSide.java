package com.company.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {

        int[] resultArr = new int[arr.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
               if (arr[j] > max){
                   max = arr[j];
                   resultArr[i] = arr[j];
               }
            }
            max = Integer.MIN_VALUE;
        }
        resultArr[resultArr.length-1] = -1;
        return resultArr;
    }
}