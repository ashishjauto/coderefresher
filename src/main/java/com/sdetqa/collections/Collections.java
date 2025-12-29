package com.sdetqa.collections;

public class Collections {

    public static void main(String[] args) {
        Object a[] = new Object[100];


        for(int i =0;i<a.length-1;i++){

            a[i]=i*i;
        }

        int length =0;
        while(length<a.length){

            System.out.println(a[length]);
            length++;

        }


    }
}
