package com.leet.twentyfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        List<Integer> addFizzBuzz= new ArrayList<>();

        List<String> FizzBuzz= new ArrayList<>();

        for(int i=0;i<20;i++){
            addFizzBuzz.add(i);
        }

        System.out.println(addFizzBuzz);

        for(int i=0; i <addFizzBuzz.size()-1;i++){

            if(addFizzBuzz.get(i)%3==0 & addFizzBuzz.get(i)%5==0){
                FizzBuzz.add("FizzBuzz");
            } else if (addFizzBuzz.get(i)%5==0) {
                FizzBuzz.add("Buzz");
            } else if (addFizzBuzz.get(i)%3==0) {
                FizzBuzz.add("Fizz");
            } else{
                FizzBuzz.add(String.valueOf(i));
            }
        }

        System.out.println(FizzBuzz);


    }
}
