package com.company.String;

public class ReverseInteger {
    public static int reverse(int x) {

        try {
            String str = String.valueOf(x);
            StringBuilder sb = new StringBuilder(str);


            if (str.charAt(0) == '-'){
                sb = new StringBuilder(str.replace("-", ""));
                sb.reverse();
                str =  "-" + sb;
            }else {
                str = String.valueOf(sb.reverse());
            }
            return Integer.parseInt(str);
        }catch (NumberFormatException exception){return 0;}

    }
}