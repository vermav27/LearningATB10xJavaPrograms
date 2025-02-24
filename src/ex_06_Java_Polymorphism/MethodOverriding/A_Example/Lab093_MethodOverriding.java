package ex_06_Java_Polymorphism.MethodOverriding.A_Example;

public class Lab093_MethodOverriding {
    public static void main(String[] args) {
        Father F1 = new Father();
        F1.home();

        Son S1 = new Son();
        S1.home();

        Father F2 = new Son(); //When son is born father can be there. ( This type of object declaration is dynamic dispatch. )
        F2.home(); // ridden the father method means father k method ko hata diya.
        //So here if son has same name function then it will call son's "home" function
        //if Son's "home" function is not there then it will call father's "home" function
    }
}
