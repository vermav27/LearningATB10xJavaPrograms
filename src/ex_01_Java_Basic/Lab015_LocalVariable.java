package ex_01_Java_Basic;

public class Lab015_LocalVariable {

    public static void main(String[] args) {
        {
            int a = 10;
            System.out.printf("Value of inner a : %d",a);
            System.out.println();
            /*
            Here scope of this a = 10 is with in the bracket
             */
        }
        int a = 20;
        System.out.printf("Value of outer a : %d",a);
        /*
        Scope of this a = 20 is out of the bracket
        */

    }

}
