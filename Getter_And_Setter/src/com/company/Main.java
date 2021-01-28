package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Square sqr = new Square();
        sqr.setA(54);
        sqr.setB(78);
        System.out.println(sqr.getA()+sqr.getB());

        //System.out.println(sqr.a + sqr.b);
        //sqr.print();
    }
}

class Square{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    void print(){
        System.out.println(a);
        System.out.println(b);
    }


}
