package com.sdetqa.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FitlerDemo {

    public static void main(String[] args) {
        List<Integer> integerArrayList=  Arrays.asList(10,20,30,50,90,2,-1);
        List<String>stringList =Arrays.asList("LeetCode","Ashish","Jaiswal","Tester","Autoamtion");



        List<Integer> filterlist;

        filterlist=integerArrayList.stream().filter(n->n%2==0).collect(Collectors.toList());

      //     integerArrayList.stream().filter(n->n%2==0).forEach(System.out::println);


      //  stringList.stream().filter(s->!s.isEmpty()).forEach(System.out::println);

        stringList.stream().map(vname->new StringBuilder(vname).reverse()).forEach(System.out::println);


    }
}
