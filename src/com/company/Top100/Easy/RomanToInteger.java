package com.company.Top100.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {

        String[] arr = s.split("");
        Map<String, Integer> map = new HashMap<>();
        System.out.println(Arrays.toString(arr));
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        // XII => 12 x=10, II = 2;

        //pobierac od konca kazdy ze znaow i dodawac do nowej zmiennej int
//jak na pozycji do przodu wieksza liczba to odejmi jej wartosc od wiekszej

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length-1 && map.get(arr[i]) < map.get(arr[i+1])) {
                sum += map.get(arr[i+1]) - map.get(arr[i]);
                i++;
            } else {
                sum += map.get(arr[i]);
            }
        }

        System.out.println(arr[6]);
        return sum;
    }
}