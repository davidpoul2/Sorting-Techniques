package com.David.InsertionSort;

public class Insertion {

    public void insertionSort(Integer[] arr){

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
}
