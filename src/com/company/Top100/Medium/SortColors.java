package com.company.Top100.Medium;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
int temp = 0;
       for (int i = 0; i < nums.length-1 ;i++) {

           if (nums[i] > nums[i + 1]) {
               temp = nums[i];
               nums[i] = nums[i + 1];
               nums[i + 1] = temp;
           }
       }
        System.out.println(Arrays.toString(nums));
    }

}