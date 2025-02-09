package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab044_TSK_LoanEligibility {

    public static void main(String[] args) {

        //Age Input
        System.out.print("Enter Age : ");
        Scanner ageScan = new Scanner(System.in);
        int age = ageScan.nextInt();
        
        //Age Validation
        if(age < 1 ){
            System.out.println("Age should be a positive value");
            System.exit(0);
        } else if ( age > 0 && age < 18) {
            System.out.println( "Age should be atleast 18");
            System.exit(0);
        } else if ( age > 80) {
            System.out.println("Max age can be 80");
            System.exit(0);
        }

        //Salary Input
        System.out.print("Enter Salary : ");
        Scanner salaryScan = new Scanner(System.in);
        double salary = salaryScan.nextInt();

        //Salary Validation
        if(salary < 1 ){
            System.out.println("Salary should be a positive value");
            System.exit(0);
        } else if (salary > 0 && salary < 30000) {
            System.out.println("Salary should be greater than or equal to 30000");
            System.exit(0);
        }

        //Credit Score Input
        System.out.print("Enter Credit Score : ");
        Scanner creditScan = new Scanner(System.in);
        int creditScore  = creditScan.nextInt();

        //Credit Score Validation
        if(creditScore < 1 ){
            System.out.println("Credit score should be a positive value");
            System.exit(0);
        } else if (creditScore < 650) {
            System.out.println("Credit score should be greater than or equal to 650");
            System.exit(0);
        } else if (creditScore > 850) {
            System.out.println("Credit score should be less than or equal to 850");
            System.exit(0);
        }

        System.out.println("Congratulations ! You are eligible for loan.");
    }
}
