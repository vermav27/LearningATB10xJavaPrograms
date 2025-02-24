package ex_07_Java_Encapsulation.A_ProblemExample;

public class Lab095_LoginClass_Main {
    public static void main(String[] args) {
        LoginClass L1 = new LoginClass("admin","pass123");
        System.out.println(L1.username); //So now here user is able to access the username outside the class
        System.out.println(L1.password); //So now here user is able to access the password outside the class
    }
}
