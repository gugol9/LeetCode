package com.company;

import com.company.Arrays.*;
import com.company.Code.AmstrongNumber;
import com.company.Code.FibIteracynie;
import com.company.Code.NTyWrazFib;
import com.company.Code.ReverseString;
import com.company.Desing.EncodeAndDecodeTinyURL;
import com.company.Desing.MyHashSet;
import com.company.Desing.UndergroundSystem;
import com.company.Easy.ConvertTheTemperature;
import com.company.Easy.NumberOfGoodPairs;
import com.company.Math.*;
import com.company.SS.Zad4;
import com.company.Singelton.Admin;
import com.company.String.RotateImage;
import com.company.Top100.Easy.BestTimeToBuyAndSellStock;
import com.company.Top100.Easy.CountingBits;
import com.company.Top100.Easy.LongestCommonPrefix;
import com.company.Top100.Medium.*;
import com.company.ZadaniaKsiazka.ProjektowanieObiektowe_8.Connect;
import com.company.ZadaniaKsiazka.ReplaceMinMaxElementInArray;
import com.company.ZadaniaKsiazka.Rozdzial1.CountAndPrintChar;
import com.company.ZadaniaKsiazka.Rozdzial1.ReplaceSpace;
import com.company.ZadaniaKsiazka.Rozdzial1.isPermutation;
import com.company.ZadaniaKsiazka.School.Group;
import com.company.ZadaniaKsiazka.School.School;
import com.company.ZadaniaKsiazka.School.Student;
import com.company.ZadaniaKsiazka.School.Teacher;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        System.out.println(PartitionEqualSubsetSum.canPartition(new int[]{1,5,3}));
        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight","flower"}));

        System.out.println(Arrays.toString(RunningSumOf1dArray.runningSum(new int[]{1, 2, 3, 4})));

        System.out.println();

        System.out.println(Arrays.toString(ShuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println();

        System.out.println(Arrays.toString(DailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));

        System.out.println(FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(new String[]{"--X","X++","X++"}));

        System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));

        System.out.println(LongestPalindromicSubstring.longestPalindrome("bb"));

        System.out.println(LongestConsecutiveSequence.longestConsecutive(new int[]{1,2,0,1}));
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(CountingBits.countBits(5)));
        System.out.println();    System.out.println();

        System.out.println(Arrays.toString(ConvertTheTemperature.convertTemperature(36.50)));
        System.out.println();

        System.out.println(NumberOfGoodPairs.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
        System.out.println();
        System.out.println(PowerOfFour.isPowerOfFour(16));

        System.out.println(ExcelSheetColumnNumber.titleToNumber("A"));
        System.out.println(UglyNumber.isUgly(14));
        System.out.println(AddBinary.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));


        System.out.println();
        System.out.println(MaximumNumberofWordsFoundinSentences.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));


        System.out.println(Arrays.toString(HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));

        System.out.println(MultiplyStrings.multiply("123456789","987654321"));

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(14);
        IntSummaryStatistics summaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        double d= summaryStatistics.getAverage();

        System.out.println(d);

        System.out.println(BestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));

        System.out.println(FibIteracynie.sum(10));

        System.out.println(NTyWrazFib.fib(10));

        System.out.println();
        System.out.println(MaximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        System.out.println(Integer.MIN_VALUE);

        System.out.println(SumOfSquareNumbers.judgeSquareSum(8));

        System.out.println(DivideTwoIntegers.divide(10,3));

      // DZIALA  System.out.println(IsSubsequence.isSubsequence("abc","ahbgdc"));
        System.out.println(IsSubsequence.isSubsequenceCHINCZYK("abc","ahbgdc"));

        System.out.println(AmstrongNumber.isAmstrongNumber(371));

        System.out.println(ReverseString.reverseString("Kamil"));

        ReplaceMinMaxElementInArray.replaceMinMax(new int[]{1, 2, 3, 4, 5});

        System.out.println(isPermutation.isPermutation("kot","otok"));

        System.out.println(ReplaceSpace.replaceSpacec(" kamil markowski r r"));

        System.out.println(CountAndPrintChar.countChar("aabccccaaa"));



        Admin admin = Admin.getInstance();
        admin.setName("Kamil");


        Admin admin1 = Admin.getInstance();
        admin1.setName("222");
        System.out.println("admin1"+admin1);
        System.out.println("admin0"+admin);


        Connect connect = Connect.getInstance();
        connect.setConnectName("ddd");

        Connect connect1 = Connect.getInstance();
        connect1.setConnectName("aaa");

        System.out.println(connect);
        System.out.println(connect1);

        Student student = new Student("Kamil", "Markowski");

        Teacher teacher = new Teacher("Mariusz", "Wawa");
        Group group = new Group("angielski",teacher);
        School school = School.getInstance("ZST");

        school.addTeacher(teacher);
        school.addGroup(group);
        school.addStudent(student);
        System.out.println(school);

    //    System.out.println(Zad4.getMaxDiv(106));

        Zad4.soutGetMaxDiv(51);

        RotateImage.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println();
        System.out.println(CountNumberOfPairsWithAbsoluteDifferenceK.countKDifference(new int[]{1,2,2,1},1));

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println(myHashSet.contains(2));
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(0));
        System.out.println(myHashSet.contains(4));

        myHashSet.remove(2);

        System.out.println(myHashSet);

        List<List<Integer>> lists = new ArrayList<>();


        System.out.println(lists);

        System.out.println("dd");

        System.out.println(Arrays.toString(ReplaceElementsWithGreatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));

        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(1,"RZE",50);
        undergroundSystem.checkIn(2,"RZE",50);

        undergroundSystem.checkOut(1,"KR",100);
        undergroundSystem.checkOut(2,"KR",400);

        double param3 = undergroundSystem.getAverageTime("RZE", "KR");
        System.out.println(param3);


        System.out.println(undergroundSystem);

        EncodeAndDecodeTinyURL encodeAndDecodeTinyURL = new EncodeAndDecodeTinyURL();


        System.out.println(encodeAndDecodeTinyURL.encode("https://leetcode.com/problems/design-tinyurl"));
        System.out.println(encodeAndDecodeTinyURL.decode("1"));

    }
}
