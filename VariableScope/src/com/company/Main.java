package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VariableScopes var = new VariableScopes();
        var.localVariable();
        var.stVariable();
        var.instanceVariable();
        System.out.println(var.a);
    }
}

class VariableScopes{

    int add = 89;
    void localVariable(){
        System.out.println("this is local variable.");
        int a = 12,b=30;
        System.out.print(a + " ");
        System.out.print(b);
    }

    static int a =90;
    void stVariable(){
        System.out.println();
        System.out.println("this is static variable");
        System.out.println(a);
    }
    void instanceVariable(){
        System.out.println();
        System.out.println("this is instance variable");
        System.out.println(add);
    }

}
