package com.company;

public class Main {

    public static void main(String[] args) {

        Main m1 = new Main();

        int[] arr = {45, -89, 8, 20, 4, 63, -7, 6, 55, 130, 7};
        System.out.println("Largest Element is : " + m1.largestElement(arr));
        System.out.println("Smallest Element is : " + m1.smallestElement(arr));

    }

    int largestElement(int[] arr){
        int largestVal = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    largestVal = i;
                }
            }

        }
        return arr[largestVal];

    }

    int smallestElement(int[] arr){

        int smallestVal = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    smallestVal = i ;
                }
            }

        }
        return arr[smallestVal];

    }
}
