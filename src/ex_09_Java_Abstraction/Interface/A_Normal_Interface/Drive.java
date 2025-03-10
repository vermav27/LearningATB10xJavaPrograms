package ex_09_Java_Abstraction.Interface.A_Normal_Interface;

public class Drive implements Engine,Brake {


    @Override
    public void applyBrake() {
        System.out.println("Apply Break....");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine Starting Now.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopping Now.");
    }

    void driving(){
        startEngine();
        applyBrake();
        stopEngine();
    }

}
