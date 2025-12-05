package com.code.leetcode.four.twopointer;

public class SquareArrayElement {

    public static void main(String[] args) {

        int[] arraySquareAndSort={-1,2,9,15};

        int [] result = sortedSquareArray(arraySquareAndSort);

        for(int i=0 ;i <result.length;i++){
            System.out.println(result[i]);
        }


    }

    private static int[] sortedSquareArray(int[] arraySquareAndSort) {

        int size =arraySquareAndSort.length;
        int [] sortedArray=new int[size];
        int curr =size -1;
        int left =0 ;
        int right = arraySquareAndSort.length -1;




        while(left<=right){

            int tempLeft = arraySquareAndSort[left]*arraySquareAndSort[left];
            int tempRight = arraySquareAndSort[right]*arraySquareAndSort[right];

            if(tempLeft>tempRight){
                sortedArray[curr]=tempLeft;
                curr--;
                left++;
            }
            else {
                sortedArray[curr]=tempRight;
                curr--;
                right--;
            }

        }
        return sortedArray;





    }
}
