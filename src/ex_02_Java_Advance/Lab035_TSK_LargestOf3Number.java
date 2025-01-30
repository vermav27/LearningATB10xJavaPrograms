package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab035_TSK_LargestOf3Number {

    public static void main(String[] args) {

        //Write a program to find the Largest of Three Numbers.

        System.out.print("Enter number 1 : ");
        Scanner sc1 = new Scanner(System.in);
        if(!sc1.hasNextInt()){
            System.out.print("Entered value is not number");
            System.exit(0);
        }

        System.out.print("Enter number 2 : ");
        Scanner sc2 = new Scanner(System.in);
        if(!sc2.hasNextInt()){
            System.out.print("Entered value is not number");
            System.exit(0);
        }


        System.out.print("Enter number 3 : ");
        Scanner sc3 = new Scanner(System.in);
        if(!sc3.hasNextInt()){
            System.out.print("Entered value is not number");
            System.exit(0);
        }
        int number1 = sc1.nextInt();
        int number2 = sc2.nextInt();
        int number3 = sc3.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("Number 1 is largest : " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 is largest : " + number2);
        }else{
            System.out.println("Number 3 is largest : " + number3);
        }
    }
}
