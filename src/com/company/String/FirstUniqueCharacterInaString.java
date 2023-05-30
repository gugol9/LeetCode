package com.company.String;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//return index first non-repetaing character
public class FirstUniqueCharacterInaString {
    public static int firstUniqChar(String s) {


        //dziala zslozonsc jest O(n^2) bo

            String[] arr = s.split("");
            List<String> list = new ArrayList<>(Arrays.asList(arr));

            return list.stream().filter(x -> Collections.frequency(list,x) == 1)
                    .map(list::indexOf)
                    .findFirst()
                    .orElse(-1);


    }
    //dziala zslozonsc jest O(n)
    public static int firstUniqChar1(String s) {
        String[] arr = s.split("");
        Map<String, Long> frequencies = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return IntStream.range(0, arr.length)
                .filter(i -> frequencies.get(arr[i]) == 1)
                .findFirst()
                .orElse(-1);
    }

    //dziala zslozonsc jest O(n)
    public static int firstUniqChar2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }


}
