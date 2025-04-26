package com.code.auto.six.sorting;

import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {


        //int [] unsorted ={2,3,4,5,6,11,-1,22};

        int [] unsorted ={4,2,5,8,6,9,1};

        int [] sorted = sortArray(unsorted);

        for(int i =0 ; i<sorted.length ;i++){
            System.out.println(sorted[i]);

        }

    }

    private static int[] sortArray(int[] unsorted) {

        merge_sort(unsorted,0,unsorted.length-1);
        return unsorted;
    }

    private static void merge_sort(int[] unsorted, int left, int right) {

        if(right>left){
            int middle = (left+right)/2;
            merge_sort(unsorted,left,middle);
            merge_sort(unsorted,middle+1,right);
            merge(unsorted,left,middle,right);

        }


    }

    private static void merge(int[] unsorted, int left, int middle, int right) {
        int [] leftTmpArray = new int[middle-left+2];
        int [] rightTmpArray = new int[right-middle+1];

        for(int i =0 ; i <=middle-left;i++){
            leftTmpArray[i]=unsorted[left+i];

        }
        for(int i =0 ; i <right-middle;i++){
            rightTmpArray[i]=unsorted[middle+1+i];

        }

        leftTmpArray [middle-left+1]=Integer.MAX_VALUE;
        rightTmpArray [right-middle]=Integer.MAX_VALUE;

        int i =0 ,j=0;

        for(int k = left;k<=right ;k++){
            if(leftTmpArray[i]<rightTmpArray[j])
            {
                unsorted[k] = leftTmpArray[i];
                i++;
            }
            else {
                unsorted[k]= rightTmpArray[j];
                j++;
            }


        }
    }

}
