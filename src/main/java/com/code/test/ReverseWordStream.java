package com.code.test;
import java.util.Arrays;
import java.util.stream.Collectors;
public class ReverseWordStream {



    public class ReverseWordsStream {
        public static void main(String[] args) {
            String input = "My name is Ashish";
            System.out.println(reverseEachWord(input));
        }

        public static String reverseEachWord(String sentence) {
            return Arrays.stream(sentence.split(" "))
                    .map(word -> new StringBuilder(word).reverse().toString())
                    .collect(Collectors.joining(" "));
        }
    }
}
/**
 *
 *
 *
 public class ReverseWords {
 public static void main(String[] args) {
 String input = "My name is Ashish";
 String result = reverseEachWord(input);
 System.out.println(result);
 }

 public static String reverseEachWord(String sentence) {
 String[] words = sentence.split(" ");
 StringBuilder sb = new StringBuilder();

 for (String word : words) {
 sb.append(new StringBuilder(word).reverse());
 sb.append(" ");
 }

 return sb.toString().trim();
 }
 }
 *
 *
 */