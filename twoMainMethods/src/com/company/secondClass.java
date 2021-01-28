package com.company;

public class secondClass {

    public static void main(String args[]){
        System.out.println("this is second class.");
        secondClass second = new secondClass();
        System.out.println(second.multiplication());
    }

    int multiplication(){
        return 10*87;
    }
}
