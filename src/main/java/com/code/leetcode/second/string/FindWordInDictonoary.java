package com.code.leetcode.second.string;

import java.util.*;

public class FindWordInDictonoary {


    public static void main(String[] args) {
        String s = "leetcode";

        List<String > dictonary  = new ArrayList<>();
        dictonary.add("leet");
        dictonary.add("code");
        dictonary.add("vcode");


        System.out.println(wordBreak(s,dictonary));

    }

    private static boolean wordBreak(String s, List<String> dictonary) {

        boolean[] dp = new boolean[s.length() +1];
        Set<String> set = new HashSet<>();
        for (String word : dictonary) {
            set.add(word);
        }

        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) ;
                dp[i] = true;
                break;
            }
        }

        return dp[s.length()];
    }


}
