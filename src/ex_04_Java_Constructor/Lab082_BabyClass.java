package ex_04_Java_Constructor;

public class Lab082_BabyClass {
    String name;

    Lab082_BabyClass(){
        System.out.println("This is my Day 1 in world. (I am called when the object is created.)");
    }

    //Instance Initialization Block : This will also be called once the object will be created
    {
        System.out.println("Myself \"Instance Initialization Block\" will be always be called once object created.");
    }

    void cry(){}
}
