package com.company.Top100.Easy;

import java.util.Arrays;


public class FindDuplicateNumber {
    public static int  findDuplicate(int[] nums) {

        Arrays.sort(nums);
        int duplicate = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] ==nums[i-1]) duplicate = nums[i];
        }
        return duplicate;
    }
}