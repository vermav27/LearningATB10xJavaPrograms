package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab027_TSK_Leapyear {

    public static void main(String[] args) {
        //Checking if a year is leap year of not.
        /* Logic :
        If a number is divisible by 100.
                If it is divisible by 400
                    then its a leap year
                If it is not divisible by 400
                    then its not a leap year
        If a number is divisible by 4
            Then its a leap year.
         */
        System.out.print("Enter an year ( Please enter a valid integer ) : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt() == true){

            int year = sc.nextInt();
            if(year > 0){

                if(year%100 == 0){

                   if(year%400 == 0){
                       System.out.println("This is a leap year : "+ year);
                   }else{
                       System.out.println("This is not a leap year :"+ year);
                   }

                }else if(year%4 == 0){
                    System.out.println("This is a leap year :"+ year);
                }else{
                    System.out.println("This is not a leap year");
                }

            }else{
                System.out.println("Please Enter a valid Year");
            }

        }else{
            System.out.println("Please enter a valid integer");
        }

    }

}
