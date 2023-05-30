package com.company.Arrays;

public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {

        int[] runningSumArr = new int[nums.length];
        runningSumArr[0] = nums[0];
        int sum = nums[0];

        for (int i = 1, j = 1; i < nums.length; i++, j++){
            sum += nums[j];
            runningSumArr[i] = sum;

        }
        return runningSumArr;
    }
}
/*
Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 */