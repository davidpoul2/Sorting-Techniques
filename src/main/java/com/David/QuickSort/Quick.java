package com.David.QuickSort;

public class Quick {
    public void quickSort(Integer arr[]){
        int low = 0;
        int high = arr.length-1;
        qs(arr, low, high);
    }

    private void qs(Integer[] arr, int low, int high){
        if(low < high){
            int pIndex = sort(arr,low,high);
            qs(arr, low, pIndex-1);
            qs(arr, pIndex+1, high);
        }
    }

    private int sort(Integer[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(pivot >= arr[i] && i < high){
                i++;
            }
            while(pivot < arr[j] && j > low){
                j--;
            }
            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, low,j);
        return j;
    }

    private void swap(Integer[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
