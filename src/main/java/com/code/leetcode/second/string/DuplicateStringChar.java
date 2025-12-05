package com.code.leetcode.second.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringChar {



    //Print Duplicate i.e. common characters by Comparing both Strings

    public static void main(String[] args) {
        String s1 = "Java With Collections";
        String s2 = "Java Selenium";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Use Sets to store characters and avoid duplicates
        Set<Character> set1 = new HashSet<>();
        Set<Character> common = new HashSet<>();

        // Add all characters from s1 to set1
        for (char ch : s1.toCharArray()) {
            if (ch != ' ') {
                set1.add(ch);
            }
        }

        // Check for common characters in s2
        for (char ch : s2.toCharArray()) {
            if (ch != ' ' && set1.contains(ch)) {
                common.add(ch);
            }
        }

        System.out.println("Common characters: " + common);

    }





}
