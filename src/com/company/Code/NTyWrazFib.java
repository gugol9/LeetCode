package com.company.Code;

//zwraca n-ty wyraz ciagu fib n = 10 to zwroc 55 bo 55 to 10 wyraz ciagu fibonnaciego.rrr
public class NTyWrazFib {
    public static int fib(int n) {


        if (n < 0)
            throw new IllegalArgumentException("Input cannot be negative");


        int pev1 = 0;
        int pev2 = 1;
        int next = 0;

        for (int i = 0; i < n ;i++){
            next = pev1+pev2;
            pev1 = pev2;
            pev2 = next;
        }

        return pev1;
    }
}