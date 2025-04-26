package com.code.auto.six.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int [] unsorted ={2,4,3};

        int [] sorted = sortArray(unsorted);

        for(int i =0 ; i<sorted.length ;i++){
            System.out.println(sorted[i]);

        }
    }


    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot-1 );
            quickSort(array, pivot + 1,end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start-1;
        for (int j = start; j <= end; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }
}
