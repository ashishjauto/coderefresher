package com.code.auto.secondstring;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWordsInString {


    public static void main(String[] args) {
        String duplicateString = "Big black bug bit big bug black dog on his big black nose";

        String [] splitText = duplicateString.split(" ");

        HashMap<String , Integer> valuelist = new HashMap<>();

        for(String e : splitText){

            valuelist.put(e,valuelist.getOrDefault(e,0)+1);
        }

        for(Map.Entry<String,Integer> entry:valuelist.entrySet()){
            System.out.println(entry.getKey() +" " +entry.getValue());


        }


    }
}
