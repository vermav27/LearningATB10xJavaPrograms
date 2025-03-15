package ex_13_Java_Exception;

public class Lab117_Example6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        int z = 0;
        //This is an example of : One try can have multiple catch.
        //But this is not a best practice.
        //Good practice is to put the exact exception in catch block.
        //So we can use "Exception e"
        try {
            z = x/y;
        } catch (ArithmeticException e) {
            System.out.println("This is arithmatic exception");
        } catch (Exception e) {
            System.out.println("This is exception.");
        } catch (Throwable e) {
            System.out.println("This is Throwable.");
        }

        System.out.println("This is the value of z : " + z);
    }
}
