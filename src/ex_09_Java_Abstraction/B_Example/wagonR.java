package ex_09_Java_Abstraction.B_Example;

public class wagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting Engine Now");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Engine Now");
    }

    void drive(){
        startEngine();
        System.out.println("Car Running....");
        stopEngine();
    }
}
