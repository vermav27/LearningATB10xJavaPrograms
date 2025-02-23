package ex_05_Java_Inheritance.A_SingleInheritance.RealExample;

public class TestCase2 extends CommonToAllTest {

    void RunTestCase2(){
        startBrowser();
        DBConnecting();
        System.out.println("Running Test 2");
        DBDisconnect();
        closeBrowser();
    }

}
