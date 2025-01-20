package ex_02_Java_Advance;

public class Lab017_TSK_TernaryOperator {

    public static void main(String[] args) {

    /*
    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59
    */

        int marks = 60;
        String result = ( x >= 0 && x <= 59 ) ? "F" : (( x >= 60 && x <= 69 ) ? "D" : (( x >= 70 && x <= 79) ? "C" : ( (x >= 80 && x <= 89) ? "B" : "A" ) )) ;
        System.out.println("Grade is : " + result);

    }

}
