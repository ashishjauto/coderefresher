package com.sdetqa.lambda;

import java.util.function.Predicate;

public class FunctionalPredicate {

    public static void main(String[] args) {

        Predicate<Integer> testPredicate =i->(i>10);


        System.out.println(testPredicate.test(20));
        System.out.println(testPredicate.negate().test(20));
    }
}
