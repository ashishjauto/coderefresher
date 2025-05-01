package com.code.auto.third.array.basic;

public class LargestElementArray {


    /**
     *
     * Input: arr[] = [10, 20, 4]
     * Output: 20
     * Explanation: Among 10, 20 and 4, 20 is the largest.
     *
     *
     * Input: arr[] = [20, 10, 20, 4, 100]
     * Output: 100
     *
     *
     *
     */

    public static void main(String[] args) {


        int[] arr ={20, 10, 20, 4, 100};
        System.out.println(findLargestElement(arr));

    }

    private static int findLargestElement(int[] arr) {
            int max = arr[0];
           for(int i = 1; i <arr.length;i++){
               if(arr[i]>max){
                   max = arr[i];

               }
           }

           return max;
    }
}
