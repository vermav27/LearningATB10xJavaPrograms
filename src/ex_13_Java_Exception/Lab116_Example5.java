package ex_13_Java_Exception;

public class Lab116_Example5 {
    public static void main(String[] args) {

        String x = null;

        try {
            x.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Trim is not for null.");
        }


    }
}
