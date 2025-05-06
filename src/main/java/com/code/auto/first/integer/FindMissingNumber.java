package com.code.auto.first.integer;

public class FindMissingNumber {


    /**
     *
     *
     *
     *
     * Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
     * Output: 6
     * Explanation: All the numbers from 1 to 8 are present except 6.
     */

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};



        int n = arr.length + 1;

        // Create hash array of size n+1
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }


        for (int i = 0; i < hash.length; i++) {
            System.out.println(hash[i]);
        }



        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                System.out.println(i);
            }
        }






    }
}
