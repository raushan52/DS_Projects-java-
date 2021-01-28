package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20,35,-15,7,55,1,-22};

        for(int lastUnsortedElement = intArray.length-1 ;lastUnsortedElement > 0; lastUnsortedElement--){

            int largest = 0;

            for(int i = 1; i<= lastUnsortedElement; i++){

                if(intArray[i] > intArray[largest]){
                    largest = i;
                }

            }

            swap(intArray, largest, lastUnsortedElement);


        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array,int a, int b){

        if(a == b){
            return;
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }
}
