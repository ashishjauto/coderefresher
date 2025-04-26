package com.code.auto.third.array.basic;

public class ArrayPrintAlternate {


    /**
     *
     *
     *
     *
     *  Input: arr[] = [10, 20, 30, 40, 50]
     * Output: 10 30 50
     * Explanation: Print the first element (10), skip the second element (20),
     *              print the third element (30), skip the fourth element(40)
     *              and print the fifth element(50).
     */

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};


        for(int i  = 0 ;i <arr.length;i+=2){
           // System.out.println(arr[i]);


                System.out.println(arr[i]);

        }




    }
}
