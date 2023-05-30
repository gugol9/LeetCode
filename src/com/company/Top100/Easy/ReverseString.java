package com.company.Top100.Easy;

public class ReverseString {
    public static void reverseString(char[] s) {

        //zapisac 0 znak jako ostatni w tablicy


       // char[] newCharArr = new char[s.length];
        for (int i = 0,j = s.length-1; i < j; i++,j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}

/*      int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;

 */