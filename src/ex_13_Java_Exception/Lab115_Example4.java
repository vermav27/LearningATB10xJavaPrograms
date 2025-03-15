package ex_13_Java_Exception;

public class Lab115_Example4 {
    public static void main(String[] args) {

        int x = 12;
        int y = 0;

        try {
            y = x/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(y);
    }
}
