package com.code.auto.secondstring;

import java.util.List;

public class ReverseWordsOfString {

    public static void main(String[] args) {


        String wordsWithSpaces ="the sky is blue";

        String reversal ="";

        List<String> string = List.of(wordsWithSpaces.split(" "));

        System.out.println(string);

        for(int i=string.size()-1;i>=0;i--)
        {


        }

        System.out.println( reversal);

    }
}
