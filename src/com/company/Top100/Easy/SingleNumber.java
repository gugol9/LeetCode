package com.company.Top100.Easy;


import java.util.HashMap;
import java.util.Map;

//Zwraca liczbe ktora wystepuje tylko raz w tablicy
public class SingleNumber {
    public static int singleNumber(int[] nums) {

        int number = 0;
        //map liczba - ile razy wystepuje
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1); //pobiera wartosc klucza spod nums[i]
            }
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
            if(entry.getValue() < 2){
                number = entry.getKey();
            }
        }
        return number;
    }
}
