package ex_09_Java_Abstraction.A_Example;

public class Lab101_AbstractClass_Main {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.loanOf20k();
        S1.loanOf50k();

        /*
        * Abstract means "incomplete". So the abstract class contains abstract method or classes means incomplete.
        * So the class which extends the abstract class ( parent class ) will complete the abstract method. ( override the abstract method ).
        *
        * So here is a abstract class "Father" and class Son extends the "Father". So, Father has a abstract ( incomplete ) method of loanof50K().
        * In Son class we will complete the "loanOd50K" function. and we will use that function using Son class object.
        *
        * */
    }
}
