package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr1[][] = {{1,89,75},{56,20,15},{63,02,30}};
        int arr2[][] = {{48,8,02},{78,280,1895},{3,0562,390}};
        //int arr2[][] = {{40,50,60},{8,52,82},{88,90,02}};
        //int arr2[][] = {{48,8,02},{78,280,1895},{3,0562,390}};

        int arrSum[][] = new int[3][3];
        int arrSub[][] = new int[3][3];
        int arrMult[][] = new int[3][3];

        System.out.println("array1");
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("array2");
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                arrSum[i][j] = arr1[i][j]+arr2[i][j];
                arrSub[i][j] = arr1[i][j]-arr2[i][j];
                //arrMult[i][j] = arr1[i][j]*arr2[i][j];
            }
            System.out.println();
        }
        for(int i = 0; i <arr2.length;i++){
            for(int j = 0; j<arr2.length;j++){
                arrMult[i][j] = 0;
                for(int k =0; k<3;k++){
                    arrMult[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("matrix addition ...");
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("matrix subtraction ...");
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                System.out.print(arrSub[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();



        System.out.println("matrix multiplication ...");
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                System.out.print(arrMult[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        
    }
}

