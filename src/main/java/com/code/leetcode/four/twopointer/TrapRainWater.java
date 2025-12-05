package com.code.leetcode.four.twopointer;

public class TrapRainWater {

    public static void main(String[] args) {
        int []array = {4,2,0,3,2,5};

        System.out.println(trapWater(array));


    }

    private static int trapWater(int[] array) {

        int ans =0;
        int left =0;
        int right = array.length-1;

        while(left<right){
            if(array[left]<=array[right]){
                int curr =left;
                while(array[++left]<array[curr]){
                    ans+=array[curr]-array[left];
                }
            }
            else{
                int curr = right;
                while(array[--right]<array[curr]){
                    ans+=array[curr]-array[right];
                }




            }


        }


            return ans;


    }
}
