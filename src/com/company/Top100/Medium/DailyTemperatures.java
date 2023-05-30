package com.company.Top100.Medium;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {


        // ZLOZONOSC SLABA DZIALA ALE O(n2)
        int len = temperatures.length;
        int[] dailyArr = new int[len];

        for (int i = 0; i < len-1; i++){
          int  max  = 0;
            for (int j = i+1; j < len ;j++)
            {
                if (temperatures[j] >  temperatures[i]){
                    max = j-i;
                    break;
                }
            }
            dailyArr[i] = max;

        }
        return dailyArr;
    }
}