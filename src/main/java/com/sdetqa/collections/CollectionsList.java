package com.sdetqa.collections;

import java.util.*;
import java.util.Collections;

public class CollectionsList {


    public static void main(String[] args) {

        Queue<String> stringQueue = new ArrayDeque<>();
        List<String> stringList= new Stack<>();


        stringList.addFirst("addfirst1");
        stringList.addFirst("addSecond");

        stringList.addFirst("addSecond");
        stringList.addFirst("addSecond2");
        stringList.addFirst("addSecond");


        ListIterator iterator= stringList.listIterator();

        while(iterator.hasNext()){
            System.out.println("in while for iterator");
            System.out.println(iterator.next());
        }



        for(String e : stringList){

            System.out.println(e);
        }


        Set<String> stringSet = new HashSet<>();

        stringSet.addAll(stringList);

        System.out.println(stringSet);

    }
}
