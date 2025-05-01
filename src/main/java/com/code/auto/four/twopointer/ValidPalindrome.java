package com.code.auto.four.twopointer;

public class ValidPalindrome {

    /**
     *
     * Given string s, determine if its valid palindrome
     *
     * example  race a car / a man a plan a canal Panama
     * Assumption::
     * alphanumeric values and ignore case
     *
     *
     */

    public static void main(String[] args) {
        String checkPalindrome = "a man a plan a canal Panama";

        System.out.println(isValidPalindrome(checkPalindrome));

    }

    private static boolean isValidPalindrome(String checkPalindrome) {

        int left=0,right=checkPalindrome.length() -1;
        while(left<=right)
        {
            if(!Character.isLetterOrDigit(checkPalindrome.charAt(left))){
                left++;
            } else if (!Character.isLetterOrDigit(checkPalindrome.charAt(right))) {
                right--;
            }
            else {
                if(Character.toLowerCase(checkPalindrome.charAt(left))!= Character.toLowerCase(checkPalindrome.charAt(right))){
                    return false;
                }

                left++;
                right--;
            }

        }
            return true;

    }


}
