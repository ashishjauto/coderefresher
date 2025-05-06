package com.code.pattern.singleton;



public class SingeTonGlobalTest {


    public static void main(String[] args) {


        SingleTonGlobal singleTonGlobal =  SingleTonGlobal.getInstance();


        System.out.println(singleTonGlobal.getDescription());
    }



}
