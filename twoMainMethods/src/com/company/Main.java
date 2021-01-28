package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("this is main 1");

        sum sm = new sum();
        System.out.println(sm.addition());
        secondClass sc = new secondClass();
        System.out.println(sc.multiplication());
    }

    public static void main(String args2){
        System.out.println("this is main 2");
    }
}
