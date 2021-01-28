package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog();
        dog.name = "labrador";
        dog.color = "while";
        dog.run();
        dog.bark();
        System.out.println(dog.name);
        System.out.println(dog.color);

        System.out.println();
        Cat cat = new Cat();
        cat.name = "Persian cat";
        cat.pattern = "tabby";
        cat.run();
        cat.meow();
        System.out.println(cat.name);
        System.out.println(cat.pattern);




    }
}
class Animals{
    String name;
    void run(){
        System.out.println("Animal is running.");
    }
}
class Dog extends Animals{
    String color;

    void bark(){
        System.out.println("Dog is barking");
    }
    void run(){
        System.out.println("Dog is running");
    }
}
class Cat extends Animals{
    String pattern;
    void meow(){
        System.out.println("Meow ! Meow!");
    }
    void run(){
        System.out.println("Cat is running.");
    }
}