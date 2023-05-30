package com.company.Arrays;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
        public static int countKDifference(int[] nums, int k) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (Math.abs(nums[i] - nums[j]) == k){
                    counter++;
                }
            }
        }

        return counter;
    }

    public static int countKDifferenceMap(int[] nums, int k){
            return 0;
    }
}