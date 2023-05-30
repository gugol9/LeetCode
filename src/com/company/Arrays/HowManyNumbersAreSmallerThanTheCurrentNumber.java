package com.company.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] resultArr = new int[nums.length];
        int i = 0, j = 0;

        while(i < nums.length){
            if(nums[j] < nums[i]){
                resultArr[i] += 1;
                j++;
            }else {
                j++;
            }
            if (j == nums.length){
                i++;
                j = 0;
            }
        }

        return resultArr;
    }
}
