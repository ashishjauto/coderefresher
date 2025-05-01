package com.code.auto.first.integer;

public class Palindrome {


    /**
    *
    *
    * Find if the number is palindrome or not
    *

     */
    public static void main(String[] args) {

        int checkPalindrome=123;


        System.out.println("YOUR RESULT "+checkIntegerPalindrome(checkPalindrome));


    }
    public static boolean checkIntegerPalindrome(int variable){

        if(variable<0 || (variable%10==0 && variable!=0))
            return false;
        int reverseNumber=0;

        while (variable> reverseNumber){
            int pop= variable%10;
            reverseNumber= reverseNumber*10+pop;
            variable= variable/10;

        }




        return  variable==reverseNumber||variable== reverseNumber/10;

    }




}
