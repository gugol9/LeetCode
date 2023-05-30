package com.company.Top100.Medium;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE, i = 0, currentSum = 0;

        while (i < nums.length){
            currentSum += nums[i];

            if (currentSum > max)max = currentSum;
            if (currentSum < 0) currentSum = 0;
            i++;

        }
        return max;
    }
}