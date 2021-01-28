package com.company;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[7];

        arr[0] = 14;
        arr[1] = 56;
        arr[2] = 89;
        arr[3] = -87;
        arr[4] = 20;
        arr[5] = 63;
        arr[6] = -31;

        int index = -1;
       for(int i =0; i < arr.length; i++){
            if(arr[i] == 63){
                index = i;
                break;
            }
        }

        System.out.println(" Index is : " + index);


      /*  for(int ji : arr){
            System.out.println(ji);
        }*/
    }
}
