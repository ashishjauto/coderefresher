package com.code.leetcode.first.integer;

import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {




        System.out.println(fizzBuzzFunction(15));


    }

    public static ArrayList<String> fizzBuzzFunction(int element){


        ArrayList<String> fizzBuzzElements = new ArrayList<>();


        for(int i =1 ; i <=element ; i ++){
            if(i%5==0 && i%3==0){
                fizzBuzzElements.add("fizzbuzz");
            }
            else if(i%3 ==0)
            {
                fizzBuzzElements.add("fizz");
            }
            else if(i%5 ==0)
            {
                fizzBuzzElements.add("buzz");
            }
            else
                fizzBuzzElements.add(Integer.toString(i));
        }


        return fizzBuzzElements;
    }





}
