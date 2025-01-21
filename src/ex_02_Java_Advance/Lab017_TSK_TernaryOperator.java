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
        String result = ( marks >= 0 && marks <= 59 ) ? "F" : (( marks >= 60 && marks <= 69 ) ? "D" : (( marks >= 70 && marks <= 79) ? "C" : ( (marks >= 80 && marks <= 89) ? "B" : "A" ) )) ;
        System.out.println("Grade is : " + result);

    }

}
