package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        animal.run();
        Animal animal2 = new Dog();

        animal2.run();

        
    }
}
class Animal{
    void run(){
        System.out.println("Animal is running.");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("Dog is running.");
        //super.run();
    }

}
