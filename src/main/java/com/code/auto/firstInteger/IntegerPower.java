package com.code.auto.firstInteger;

public class IntegerPower {

    public static void main(String[] args) {

        System.out.println(exponetPow(5,4));



    }

    private static double exponetPow(double i, int n) {
        double ans =1.0;

        long num =n;
        if(n<0)
            num =-1 *num;

        while(num >0){
            if(num%2==0){
                i = i*i;
                num =num/2;

            }else
                {ans =ans*i;
                n = n-1;}
        }

        return ans;
    }
}
