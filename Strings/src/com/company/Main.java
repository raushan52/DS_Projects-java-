package com.company;

public class Main {

    public static void main(String[] args) {

    String str = new String("roushan"); //false
    String str2 = "rashan";
        System.out.println(str == str2);



        char [] arr = {'b','a','s','t','a','r','d'};
        String name = "Roshan";
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("han"));
        System.out.println(name + " welcome ");
        System.out.println(name.concat(" to java"));
        System.out.println(name.indexOf('s'));
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str2.compareTo(str));

    }
}
