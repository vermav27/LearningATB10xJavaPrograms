package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab048_TSK_VisaValidation {

    public static void main(String[] args) {

        System.out.print("Enter Age : ");
        Scanner ageInput = new Scanner(System.in);
        if(!ageInput.hasNextInt()){
            System.out.println("Not a valid input ! Exiting.....");
            System.exit(0);
        }
        int age = ageInput.nextInt();
        if(age < 1){
            System.out.println("Not a valid age !");
            System.exit(0);
        }
        System.out.print("Enter Visa Status ( Valid or Invalid ): ");
        Scanner statusInput = new Scanner(System.in);
        String status = statusInput.nextLine();

        if(!status.equals("Valid") && !status.equals("valid") && !status.equals("Invalid") && !status.equals("invalid")){
            System.out.println("Not a valid Input !");
            System.exit(0);
        }

        if(age >= 18 && (status.equals("Valid") || status.equals("valid"))){
            System.out.println("Person can travel");
        } else{
            System.out.println("Person cannot travel");
        }

    }

}
