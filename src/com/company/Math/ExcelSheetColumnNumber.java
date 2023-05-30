package com.company.Math;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public static int  titleToNumber(String columnTitle) {

        Map<Character, Integer> map = new HashMap<>();
        int j = 1;
        for (char i = 'A';i <= 'Z'; i++){
            map.put(i, j);
            j++;

        }

        int result = 0;
        for (int i = 0; i < columnTitle.length() ;i++){
            char c = columnTitle.charAt(i);
            int value = map.get(c);
            result = result * 26 + value; //DLA A 0 * 26 + 1 = 1
                                            // DLA AA = 0 * 26 +1  = 1 ; 1 * 26 +1 = 27 GENIALNE
        }



        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return result;
    }
}
