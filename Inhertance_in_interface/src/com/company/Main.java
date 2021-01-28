package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        it2 tt= new Test();
        tt.m1();
        tt.m2();
        tt.m3();
        tt.m4();
        tt.m5();
        tt.m6();
        tt.m7();
    }
}

interface it1{
    void m1();
    void m2();
    void m3();
}
interface it3{
    void m7();
    void m6();
}
interface it2 extends it1,it3{

    void m4();
    void m5();

}
class Adaptor implements it2{
    public void m1(){
        System.out.println("method m1");
    }
    public void m2(){
        System.out.println("method m2");
    }
    public void m3(){
        System.out.println("method m3");
    }
    public void m5(){
        System.out.println("method m5");
    }
    public void m4(){
        System.out.println("method m4");
    }
    public void m7(){
        System.out.println("method m7");
    }
    public void m6(){
        System.out.println("method m6");
    }
}
class Test extends Adaptor {
    
}
