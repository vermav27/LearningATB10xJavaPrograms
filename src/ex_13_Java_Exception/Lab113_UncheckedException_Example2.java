package ex_13_Java_Exception;

public class Lab113_UncheckedException_Example2 {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;
        int c = x/y;
        System.out.println(c);


        //java.lang.ArithmeticException --> Unchecked Exception

        String a = null;
        a.trim();

        //java.lang.NullPointerException --> Unchecked Exception
    }
}
