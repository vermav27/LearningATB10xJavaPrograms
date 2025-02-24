package ex_06_Java_Polymorphism.MethodOverloading;

public class Lab092_MethodOverloading {
    public static void main(String[] args) {
        MethodOverloadingClass m1 = new MethodOverloadingClass();
        //Here in a class two method are of same name, but on the basis of argument passed jvm choose its method that is method overloading.
        m1.add(3,4);
        m1.add(10,20,30);

    }
}
