package com.code.pattern.singleton;

public class SingleTonGlobal {


    private SingleTonGlobal(){

    }


    private static  class SingleTonHelper{
        private static SingleTonGlobal singleTonGlobal = new SingleTonGlobal();

    }

    public static SingleTonGlobal getInstance(){
        return SingleTonHelper.singleTonGlobal;
    }


    public String getDescription(){

        return "I m singleton";
    }





}
