package com.company.Top100.Easy;

public class BinarySearch {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;



      for (int i = 0; i < nums.length; i++){
          int mid = (left+right)/2;
          System.out.println("srodek: "+mid);
          if (nums[mid] == target) return mid;
          else if(nums[mid] > target) right = mid-1;
          else left = mid+1;
      }
        return  -1;

    }
}