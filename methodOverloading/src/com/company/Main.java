package com.company;

public class Main {


    public static void main(String[] args) {

      /*SimpleInterest mm = new SimpleInterest();
        System.out.println("method overloading");
        mm.calculateSimpleInterest();
        System.out.println(mm.calculateSimpleInterest(10,85,66));
        System.out.println(mm.calculateSimpleInterest(45,89,74));
*/
        Add ad = new Add();
        ad.add();
        ad.add(10,89);
        ad.add(5.6f,89.21f);

    }


}
class Add{
    void add(){
        int sum = 5+7;
        System.out.println(sum);
    }
    void add(int a, int b){
        System.out.println("sum = "+ a+b);
    }
    void add(float a, float b){
        System.out.println("sum of 2 float : " + a+b);
    }
}
/*class SimpleInterest{
    void calculateSimpleInterest(){
        System.out.println("this is void method to calculate SI.");
    }
    int calculateSimpleInterest(int a, int b, float c){
        return (int) (a*b*c);
    }
    double calculateSimpleInterest(int a, int b, int c){
        return a*b*c;
    }
}
*/

