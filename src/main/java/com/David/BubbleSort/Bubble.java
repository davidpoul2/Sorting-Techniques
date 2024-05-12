package com.David.BubbleSort;

public class Bubble {
    public void bubbleSort(Integer[] arr){

        int n =  arr.length;
        for(int j = n-1;j>0;j--){
            for(int i = 0;i < j;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
