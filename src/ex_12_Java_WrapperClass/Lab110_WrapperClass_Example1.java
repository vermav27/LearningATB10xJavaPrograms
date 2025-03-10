package ex_12_Java_WrapperClass;

public class Lab110_WrapperClass_Example1 {
    public static void main(String[] args) {
        //so here in int a = 10 , do not have much of the capabilities. because its just a data type.
        int a = 10;

        //So, here in Integer A has lot of capabilities because Integer is a class. ex. "A.intValue()"
        //It has inbuilt function to use directly
        Integer A = 10;
        Integer B = 20;
        System.out.println(A.intValue());

        /*
        * We can use it for
        * Integer
        * String
        * Long
        * Double
        * Boolean
        * Float
        * Short
        * Character
        */

        //This is called unboxing where the value of a wrapper class variable is unboxed to a datatype
        //variable
        Integer x = 100;
        int y = x;

        //This is called AutoBoxing where the value of a data type variable is boxed into a class vatiable
        //or wrapper class
        int c = 20;
        Integer c1 = c;


    }
}
