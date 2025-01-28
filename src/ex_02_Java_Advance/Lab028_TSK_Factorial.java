package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab028_TSK_Factorial {
    public static void main(String[] args) {
        //Write a program to calculate the factorial
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for calculating factorial (Between 0 and 17) : ");
        if(sc.hasNextInt()){

            System.out.println("Ok...So This is a valid integer.");
            int number = sc.nextInt();
            if(number > 0 && number < 17){

                int factorial = 1;
                for(int i = number; i>0 ; i--){
                    factorial = factorial * i;
                }
                System.out.println("Factorial value is : " + factorial);

            }else{
                System.out.println("But entered value is either less than 1 or not between 0 and 17");
            }

        }else{
            System.out.println("No ! This is not a valid input.");
        }
    }
}
