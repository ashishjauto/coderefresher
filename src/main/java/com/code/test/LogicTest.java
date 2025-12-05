package com.code.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LogicTest {


    /**
     *
     *
     * non
     * @param args
     */

    public static void main(String[] args) {

        String name = "My name is Ashish Jaiswal";

        String[] stringBuilder =   name.split(" ");





        for(String e :  stringBuilder){
            System.out.println(e);

          StringBuilder stringBuilder1= new StringBuilder(e);

              stringBuilder1.reverse();



        }



        /*char[] getChar = name.toLowerCase().toCharArray() ;

        Set<Character> getchars= new LinkedHashSet<>();

        for(char e : getChar){

            getchars.add(e);
        }



        getchars.forEach(s-> System.out.println(s));*/





    }
}
