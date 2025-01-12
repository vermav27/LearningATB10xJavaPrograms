package ex_01_Java_Basic;

public class Lab011_variables {

    public static void main(String[] args) {

        //variables
        /*
        Variable are the containers to store the data which can be changed/modified.
        variable name -> identifier
        variable value -> literal
        */
        //datatypes
        /*
        * Data type is the type of value which get stored in the variable.
        * Data Type are of 2 type : Primitive , Non Primitive.
        * Primitive :
        *   Boolean : True / False
        *   Numeric :
        *       1. Integral :
        *           1. byte
        *           2. short
        *           3. int
        *           4. long
        *           5. char
        *       2. Decimal :
        *           1. float
        *           2. double
        * Non-Primitive : Collection, Map, String etc....
        * All data type have their own range.
        * example : byte, short, int, long, double, float, boolean
        * */

        byte a = 5;
        short b = 20;
        int c = 10;
        long d = 123454566;
        float e = 10.56f;
        double f = 1345.876542343244f;
        boolean g = true;
        char h = 'h';
        //char i = "i"; we cannot put char value in double quotes. coz
        // it will become string in double quotes.

        System.out.println( a );
        System.out.println( b );
        System.out.println( c );
        System.out.println( d );
        System.out.println( e );
        System.out.println( f );
        System.out.println( g );
        System.out.println( h );


    }

}
