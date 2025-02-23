package ex_05_Java_Inheritance.A_SingleInheritance.RealExample;

public class TestCase1 extends CommonToAllTest {
    void RunTestCase1(){
        startBrowser();
        DBConnecting();
        System.out.println("Running Test 1");
        DBDisconnect();
        closeBrowser();
    }
}
