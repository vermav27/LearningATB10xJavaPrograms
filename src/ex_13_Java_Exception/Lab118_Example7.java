package ex_13_Java_Exception;

public class Lab118_Example7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x/y;
            String s = null;
            s.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        //So here we will have exception at 2 points. One at 7th line and one at 9th line.
        //we can write it like "ArithmeticException | NullPointerException e" with OR condition.
        //This is a good practice.
    }
}
