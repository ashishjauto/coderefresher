package com.code.auto.second.string;

public class LongestPrefix {

    /***
     *
     *
     * REDO next iteration
     * @param args
     */
    public static void main(String[] args) {
        String[] names = {"LeetCode", "Leet", "Lager"};

        System.out.println(longestCommonPrefix(names));
    }



    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
