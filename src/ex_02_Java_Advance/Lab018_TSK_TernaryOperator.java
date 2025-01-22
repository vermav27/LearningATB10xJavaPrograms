package ex_02_Java_Advance;

import java.sql.SQLOutput;

public class Lab018_TSK_TernaryOperator {

    public static void main(String[] args) {

        //Find greatest of three number using ternary operator
        int val1 = 9;
        int val2 = 10;
        int val3 = 2;

        int largestVal = ( val1 > val2 ? ( ( val1 > val3 ) ? val1 : val3 ) : (  ( val2 > val3 ) ? val2 : val3  ) );
        System.out.println("Greatest is : " + largestVal );

    }

}
