package com.company.Arrays;

import java.util.Arrays;
//zliczam ilosc znakow w zdaniu[i] - zdanie[i] z usunietymi spacjami i zmienna max
public class MaximumNumberofWordsFoundinSentences {
    public static int mostWordsFound(String[] sentences) {

        System.out.println(sentences[0]);
        int len = 0;
        int len1 = 0;
        int max = 0;
        int max1 = 0;

        for (int i = 0; i < sentences.length; i++){
            len = sentences[i].length();
            len1 = sentences[i].replace(" ","").length();
            System.out.println(len);
            System.out.println(len1);
            max1 = len-len1;
            System.out.println(max1);
            if (max < max1){
                max = max1;
            }
        }
        return max+1;
    }
}
