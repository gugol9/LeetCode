package com.company.Top100.Easy;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[temp] = nums[i];
                temp++;
            }
        }

        //temp = 3
        while (temp < nums.length){
            nums[temp] = 0;
            temp++;
        }

        System.out.println("nums:" + Arrays.toString(nums));

    }
}