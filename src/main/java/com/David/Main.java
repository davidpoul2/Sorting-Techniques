package com.David;

//import java.util.logging.SocketHandler;

import com.David.BubbleSort.Bubble;
import com.David.InsertionSort.Insertion;
import com.David.QuickSort.Quick;
import com.David.SelectionSort.Selection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();
        Integer arr[] = new Integer[n];

        System.out.println("Enter the values in the array : ");
        for(int i = 0 ;i< n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter \'1\' for Selection sort.");
        System.out.println("Enter \'2\' for Bubble sort.");
        System.out.println("Enter \'3\' for Insertion sort.");
        System.out.println("Enter \'4\' for Quick sort.");

        while(true){
            System.out.println("Enter your choice");
            int option = input.nextInt();
            if(option == 1){
                Selection obj = new Selection();
                Integer arr1[] = arr;
                obj.selectionSort(arr1);
                System.out.println("The Selection sorted array is " + Arrays.asList(arr1));
            }
            else if(option == 2){
                Bubble obj = new Bubble();
                Integer arr1[] = arr;
                obj.bubbleSort(arr1);
                System.out.println("The Bubble sorted array is " + Arrays.asList(arr1));
            }
            else if(option == 3){
                Insertion obj = new Insertion();
                Integer arr1[] = arr;
                obj.insertionSort(arr1);
                System.out.println("The Insertion sorted array is " + Arrays.asList(arr1));
            }
            else if(option == 4){
                Quick obj = new Quick();
                Integer arr1[] = arr;
                obj.quickSort(arr1);
                System.out.println("The Quick Sorted array is " + Arrays.asList(arr1));
            }
            else break;
        }
    }
}