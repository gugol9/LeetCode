package com.company.Code;


public class FibIteracynie {
    public static int sum(int n){
        int prev1 = 0;
        int prev2 = 1;
        int next =0;

        int sum = 0;

        for (int i = 0; i < n; i++) { // Finds fibonacci sequence
             next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;

            if (next % 2 == 0){
                sum+= next;
            }

            System.out.println(next);
        }
       return sum;
    }
}