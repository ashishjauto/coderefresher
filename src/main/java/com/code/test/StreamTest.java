package com.code.test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        String name ="My name is Ashish";

        String reverseWords= reverseStringWordsMe(name);

        System.out.println(reverseWords);
    }

    private static String reverseStringWordsMe(String name) {

        return Arrays.stream(name.split(" ")).map(s-> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));

    }
}
