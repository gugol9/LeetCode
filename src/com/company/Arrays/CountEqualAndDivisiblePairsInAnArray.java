package com.company.Arrays;

public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {

        int result = 0, counter = 0;
        for (int i =0; i < nums.length; i++){
           for (int j = i+1; j < nums.length; j++){
               if (nums[i] == nums[j]){
                   result = i*j;
                   if (result % k == 0)counter++;
               }
           }
        }
        return counter;
    }
}