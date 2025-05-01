package com.code.auto.four.twopointer;

public class RemoveDupliate {


    public static void main(String[] args) {


        int [] numArray={1,2,3,3,5,5,6,7};


        int [] uniqueArray = removeDuplicates(numArray);

        for(int i =0;i<uniqueArray.length;i++){
            System.out.print(uniqueArray[i]+", ");

        }

    }

    private static int[] removeDuplicates(int[] numArray) {

        if(numArray.length==0)
            return null;

        int i =0;
        for(int j =1;j<numArray.length;j++){
            if(numArray[j]!=numArray[i]){
                i++;
                numArray[i]=numArray[j];
            }

        }

        return  numArray;

    }
}
