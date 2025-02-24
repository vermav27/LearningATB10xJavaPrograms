package ex_06_Java_Polymorphism.MethodOverriding.B_RealExample;

public class Lab094_RealExample {
    public static void main(String[] args) {

        TestCase1 T1 = new TestCase1();
        T1.openBrowser();

        TestCase2 T2 = new TestCase2();
        T2.openBrowser();

        CommonToAllClass C1 = new TestCase2();
        C1.openBrowser();


    }
}
