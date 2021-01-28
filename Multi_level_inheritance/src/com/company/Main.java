package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Puppy puppy = new Puppy();
        puppy.name = "subhojeet";
        puppy.color = "black";
        puppy.bark();
        System.out.println(puppy.name);
        System.out.println(puppy.color);
    }
}

class Animal{
    String name;

}
class Dog extends Animal{
    String color;
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog{
    void bark(){
        System.out.println("Puppy is barking..");
    }
}
