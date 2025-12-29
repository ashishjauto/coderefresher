package com.sdetqa.leetcode;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {


        String testString = "testagain";


        String reverseString = Arrays.toString(stringReverse(testString.toCharArray()));

        System.out.println(reverseString);
    }

    private static char[] stringReverse(char[] testString) {
        int len = testString.length;

        int left = 0;
        int right = testString.length-1;

        while (left<right){
            char temp = testString[right];
            testString[left]= testString[right];
            testString[left]=temp;
            left++;
            right--;
        }

        return testString;

    }
}
