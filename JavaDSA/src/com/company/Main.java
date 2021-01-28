package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] intArray = new int[7];

        intArray[0] = 45;
        intArray[1] = 89;
        intArray[2] = 78;
        intArray[3] = -23;
        intArray[4] = 56;
        intArray[5] = -47;
        intArray[6] = 54;

        int index = -1;
        for(int i = 0; i<intArray.length;i++){
            if(intArray[i] == 54){
                index = i;
                break;
            }
        }

        System.out.println("index is : " + index);
    }
}
