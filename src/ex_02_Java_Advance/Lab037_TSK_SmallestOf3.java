package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab037_TSK_SmallestOf3 {

    public static void main(String[] args) {

        //Write a program to find the Smallest of Three Numbers.
        System.out.println("Enter 3 Numbers one by one ( All thee should be different numbers.)");
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

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();
        int num3 = sc3.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println("Number 1 is smallest.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Number 2 is smallest");
        }else {
            System.out.println("Number 3 is smallest");
        }

    }

}
