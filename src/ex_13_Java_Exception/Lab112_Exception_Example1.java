package ex_13_Java_Exception;

public class Lab112_Exception_Example1 {
    public static void main(String[] args) {
        //There can be exceptions in the program.
        //Exception is : An event that occurs during the execution of the program
        // and disrupts the flow of execution

        Integer name = Integer.parseInt(args[0]);
        int div = 100/name;
        //If we enter any string then it will give exception.
        //java.lang.NumberFormatException

        //If we donot give any value it will give this exception.
        //java.lang.ArrayIndexOutOfBoundsException

        //If we divide by zero it will give exception
        //java.lang.ArithmeticException

        /*
        * Error cannot be handled.
        * Exceptions can be handled with
        * >> Try Catch block
        * >> Try Catch Finally block
        * >> Throw
        * >> Throws
        * */

        /*
        * There are two type of exceptions
        * 1. Checked. --> JVM knows about it. Means at the complie time JVM will stops you.
        * 2. UnChecked. --> JVM donot know during the compile time. Thet are also called a run time exception.
        * */
    }
}
