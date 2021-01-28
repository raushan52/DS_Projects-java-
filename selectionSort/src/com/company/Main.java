package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = {89, 70, 45, 1, 58, 0, 56, -8, 4, 29, -40, 36, -96, 20, 121, 35};

        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            int largest = 0;

            for(int i = 1; i<= lastUnsortedIndex; i++){

                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr, largest,lastUnsortedIndex);
        }

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }

    }

    public static void swap(int[] arr, int a, int b){

        if(a == b){
            return;
        }

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
