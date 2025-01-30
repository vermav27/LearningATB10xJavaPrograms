package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab034_TSK_AgeCheck {

    public static void main(String[] args) {

        // Write a program to check if a Person is Eligible to Vote (Age Check).
        System.out.print("Enter age : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("Eligible for vote");
            }else{
                System.out.println("Not Eligible for vote");
            }
        }else{
            System.out.println("Enter a valid number");
        }
    }
}
