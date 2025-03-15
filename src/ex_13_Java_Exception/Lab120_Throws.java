package ex_13_Java_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab120_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        /*Using throws is also a method to handle exception*/

        FileInputStream file = new FileInputStream("C://hello/txt");
    }
}
