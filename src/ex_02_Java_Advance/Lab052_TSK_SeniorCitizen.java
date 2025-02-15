package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab052_TSK_SeniorCitizen {

    public static void main(String[] args) {

        System.out.print("Enter age : ");
        Scanner ageInput = new Scanner(System.in);
        int age = ageInput.nextInt();

        if(age<0){
            System.out.println("Invalid age !");
            System.exit(0);
        }

        if(age >= 0 && age <=12 ){
            System.out.println("child");
        } else if (age >= 13 && age <=19) {
            System.out.println("Teenager");
        }else if (age >= 20 && age <=64) {
            System.out.println("Adult");
        }else if (age >= 65) {
            System.out.println("Senior citizen");
        }
    }
}
