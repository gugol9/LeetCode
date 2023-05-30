package com.company.Code;

public class NextPerfectSquare {
    public static long findNextSquare(long sq) {

        //(long rzutuje w dół)
        if (Math.sqrt(sq) == (long)Math.sqrt(sq)){
            long perfect = (long) (Math.sqrt(sq)+1);
            return perfect*perfect;
        }else return -1;


    }
}
