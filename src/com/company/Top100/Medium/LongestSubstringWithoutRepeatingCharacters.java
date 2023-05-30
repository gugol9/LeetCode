package com.company.Top100.Medium;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    //zanjduje ile jest nastepuajcych po sobie par skladajacych sie z niepowtarzalnych elementow
    public static int lengthOfLongestSubstring(String s) {

        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}