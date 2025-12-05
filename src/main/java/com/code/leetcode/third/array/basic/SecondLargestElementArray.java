package com.code.leetcode.third.array.basic;

public class SecondLargestElementArray {

    /**
     *
     * Input: arr[] = [12, 35, 1, 10, 34, 1]
     * Output: 34
     * Explanation: The largest element of the array is 35 and the second largest element is 34.
     *
     *
     * Input: arr[] = [10, 5, 10]
     * Output: 5
     * Explanation: The largest element of the array is 10 and the second largest element is 5.
     *
     *
     * Input: arr[] = [10, 10, 10]
     * Output: -1
     * Explanation: The largest element of the array is 10 there is no second largest element.
     *
     *
     */

    public static void main(String[] args) {
        int [] arr ={10, 10, 10};

        System.out.println(printSecondLargest(arr));

    }

    private static int printSecondLargest(int[] arr) {

        int largest =-1;
        int secondLargest =-1;

        for( int i=0; i <arr.length ; i++){
            if(arr[i]>largest){
                largest=arr[i];

            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }



        return secondLargest;
    }


}
