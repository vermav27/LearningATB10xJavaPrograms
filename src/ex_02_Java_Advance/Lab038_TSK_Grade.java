package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab038_TSK_Grade {

    public static void main(String[] args) {
        /*
        Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
        Take user input for marks (Use Scanner class).
        Check the validity of marks (ensure they are between 0 and 100).
        Use if-else-if conditions to determine the grade based on marks.
        Display the grade as output.

        Grading Criteria (Example)
        Marks Range Grade
        90 - 100   A+
        80 - 89    A
        70 - 79    B
        60 - 69    C
        50 - 59    D
        40 - 49    E
        Below 40   Fail
        */
        System.out.print("Enter Marks Obtain : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int marks = sc.nextInt();
            if (marks >= 0 && marks <= 100){

                if(marks >= 90 && marks <= 100){
                    System.out.println("Grade A+");
                } else if (marks >= 80 && marks <= 89) {
                    System.out.println("Grade A");
                } else if (marks >= 70 && marks <= 79) {
                    System.out.println("Grade B");
                } else if (marks >= 60 && marks <= 69) {
                    System.out.println("Grade C");
                } else if (marks >= 50 && marks <= 59) {
                    System.out.println("Grade D");
                } else if (marks >= 40 && marks <= 49) {
                    System.out.println("Grade E");
                }else {
                    System.out.println("Fail !");
                }

            }else{
                System.out.println("Marks can be from 0 to 100 !");
            }
        }else{
            System.out.println(" Not a valid input ! ");
        }
    }

}
