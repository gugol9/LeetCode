package com.company.String;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
//moge sprawdzic czy s zawiera wszystkie znaki i czy ich dlugosc jest taka sama



       String[] stringsS = s.split("");
        Arrays.sort(stringsS);
       String[] stringsT = t.split("");
        Arrays.sort(stringsT);

        return Arrays.equals(stringsS, stringsT);
    }
}
