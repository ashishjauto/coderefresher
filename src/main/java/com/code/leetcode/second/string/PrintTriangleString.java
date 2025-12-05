package com.code.leetcode.second.string;

import java.util.*;

public class PrintTriangleString {

    public static <T> void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();


        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("eest");

    Set<String> covnertArray = new HashSet<>( arrayList);

        for(String s :covnertArray){
            System.out.println(s);
        }






        String test = "Java";

        for(int i =0; i<test.length();i++){

            for(int j = 0 ;j<=i;j++){
                System.out.print(test.charAt(j));
            }
            System.out.println();
        }



    }
}
