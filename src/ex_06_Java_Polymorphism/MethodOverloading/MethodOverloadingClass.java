package ex_06_Java_Polymorphism.MethodOverloading;

public class MethodOverloadingClass {
    void add(int a,int b){
        System.out.println("Addition of two digits : " + (a + b) );
    }

    void add(int a,int b,int c){
        System.out.println("Addition of three digits : " + (a + b + c));
    }
}
