package com.company.Easy;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {

        //poprawioan zlozonosc obliczeniowa




        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length;j++){
                if (nums[i] == nums[j]){
                    counter++;
                }
            }
        }

            return counter;


    }
}

/*
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.


INNE ROZWIAZANIE NIBY GORSZE
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0, j = 1, i = 0;
        while (i < nums.length-1){
            if (nums[i] == nums[j]){
                j++;
                counter++;
            }else {
                j++;
            }
            if (j == nums.length){
                i++;
                j = i+1;
            }
        }
        return counter;
    }
}

 */