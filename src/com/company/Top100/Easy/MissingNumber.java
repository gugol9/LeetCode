package com.company.Top100.Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

//zaginiony element
// tworze zakres i potem z odejmuje sume tablicy z sumy zakresu i wychodzi brakuajca liczba
public class MissingNumber {
    public static int missingNumber(int[] nums) {

      int sumRange =  IntStream.rangeClosed(0,nums.length).sum();
      int sumNums = Arrays.stream(nums).sum();

      return sumRange-sumNums;

    }
}