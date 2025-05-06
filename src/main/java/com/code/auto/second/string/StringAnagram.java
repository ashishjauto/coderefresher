package com.code.auto.second.string;

import java.util.HashMap;

public class StringAnagram {


    public static void main(String[] args) {
        String s1 ="anagram";
        String s2 ="anagarm";

        System.out.println(isAnagram(s1,s2));


    }

    private static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }
        int[]table = new int[26];
        for(int i = 0; i <s1.length();i++){

            table[s1.charAt(i)-'a']++;

            System.out.println(s1.charAt(i)-'a' +" --->"+ table[i]);

        }
        for(int i = 0; i <s2.length();i++){

            table[s2.charAt(i)-'a']--;

            if(table[s2.charAt(i)-'a']<0){
                return false;
            }
        }





        /*
        HashMap<Character,Integer> hm1 =new HashMap<>();
        HashMap<Character,Integer> hm2 =new HashMap<>();


        for(int i  = 0; i < s1.length();i++){
            if(!hm1.containsKey(s1.charAt(i))){
                hm1.put(s1.charAt(i),1);
            }else {
                hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
            }


        }
            for(int i =0; i<s2.length();i++){

                if(!hm2.containsKey((s2.charAt(i)))){

                }else {
                    hm2.put(s2.charAt(i),hm2.get(s2.charAt(i))+1);
                }

            }
            for(Character ch :hm1.keySet()){
                if(!hm1.get(ch).equals(hm2.get(ch))){
                    return false;
                }
            }


*/
        return true;

    }
}
