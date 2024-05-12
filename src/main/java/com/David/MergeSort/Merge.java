package com.David.MergeSort;

public class Merge {

    public void mergeSort(Integer[] arr){

        int low = 0;
        int high = arr.length-1;
        sort(arr, low, high);
    }

    private void sort(Integer[] arr, int low, int high){
        if(low >= high)     return;
        int mid = (low + high)/2;
        sort(arr, low,mid);
        sort(arr, mid+1,high);
        ms(arr, low, mid, high);
    }

    private void ms(Integer[] arr, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[high-low+1];

        while(i <= mid && j <= high){
            if(arr[i] < arr[j])     temp[k++] = arr[i++];
            else    temp[k++] = arr[j++];
        }

        while(i <= mid) temp[k++] = arr[i++];
        while(j <= high)    temp[k++] = arr[j++];

        for(int l = 0;l<temp.length;l++){
            arr[low++] = temp[l];
        }
    }
}
