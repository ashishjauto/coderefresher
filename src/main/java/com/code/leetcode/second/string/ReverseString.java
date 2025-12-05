package com.code.leetcode.second.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] elemetTobereversed = {'A', 'S', 'H', 'I', 'S', 'H'};

        String value = "Ashish";



        System.out.println(reverseString(value.toCharArray()));

        System.out.println(Arrays.toString(reverseString(value.toCharArray())));


    }

    private static char[] reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        return  s;


    }
}