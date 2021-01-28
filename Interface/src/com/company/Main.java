package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Dog();
        animal.eat();
        animal.run();
    }
}

interface Animal{
    abstract public void run();
    abstract public void eat();
    static final float pi = 3.14f;
}
class Dog implements Animal{
    public void run(){
        System.out.println("Dog is running.");
    }

    public void eat(){
        System.out.println("Dog is eating.");
    }
}
