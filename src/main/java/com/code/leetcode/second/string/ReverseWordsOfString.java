package com.code.leetcode.second.string;

public class ReverseWordsOfString {

    public static void main(String[] args) {

        System.out.println(reverseStringWords("a good example"));
    }

    private static String reverseStringWords(String example) {

        StringBuilder  sb = new StringBuilder();

        int stringLenght = example.length()-1;

        while (stringLenght >=0){

            if(example.charAt(stringLenght)==' '){
                stringLenght--;
            }
            else
            {
                int j = stringLenght;

                while (stringLenght>=0 && example.charAt(stringLenght)!=' ') {
                    stringLenght--;
                }
                    if(sb.length()>0){
                        sb.append(' ');
                    }
                    for(int k =stringLenght+1; k<=j;k++ ){
                        sb.append(example.charAt(k));
                    }

                }
            }









        return sb.toString();
    }


}
