package com.company.Top100.Easy;

import java.util.*;

public class MajorityElementDETERMINATOR {
    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;

        for (int i = 0; i < len ;i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }
            if (map.get(nums[i]) > len/2){
                return nums[i];
            }
        }
        return -1;
    }
}
