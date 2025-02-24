package ex_06_Java_Polymorphism.MethodOverriding.A_Example;

public class Son extends Father {

    @Override
    void home(){
        System.out.println("Son has only a single Room");
    }
}
