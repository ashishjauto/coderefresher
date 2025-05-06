package com.code.auto.twelve.fib;

public class ClimbingStairs {


    public static void main(String[] args) {

        System.out.println(climbingStairsValue(5));
    }

    private static int climbingStairsValue(int n) {

        if (n == 1) return 1;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    }
