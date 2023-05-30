package com.company.Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {

        int numsLen = nums.length;
        int[] shuffle = new int[numsLen];

        //DLA X
        for (int i = 0, j = 0; j < numsLen/2; i+=2){

            shuffle[i] = nums[j];
            j++;
        }

        //DLA Y
        for (int i = 1; n < numsLen; i+=2){
            shuffle[i] = nums[n];
            n++;

        }
        return shuffle;
    }
}