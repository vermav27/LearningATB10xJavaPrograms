package ex_13_Java_Exception;

public class Lab119_Try_Catch_Finally_Example8 {
    public static void main(String[] args) {

        //So here, Finally block means that --> If the program gets into exception or a program do not
        //get into the exception --> JVM will always execute the "Finally" block.
        int x = 10;
        int y = 1;
        int z = 0;
        try {
            z = x/y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed in any case.");
        }

        System.out.println(z);


    }
}
