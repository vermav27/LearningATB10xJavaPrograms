package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab036_TSK_SmallestOf2 {

    public static void main(String[] args) {
        //Write a program to find the Smallest of Two Numbers.
        System.out.print("Enter Number 1 : ");
        Scanner sc1 = new Scanner(System.in);
        if(!sc1.hasNextInt()){
            System.out.println("You have not entered a number ! ");
            System.exit(0);
        }

        System.out.print("Enter Number 2 : ");
        Scanner sc2 = new Scanner(System.in);
        if(!sc2.hasNextInt()){
            System.out.println("You have not entered a number ! ");
            System.exit(0);
        }

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();

        if(num1 < num2){
            System.out.println("Number 1 is smaller" );
        }else {
            System.out.println("Number 2 is smaller");
        }
    }
}
