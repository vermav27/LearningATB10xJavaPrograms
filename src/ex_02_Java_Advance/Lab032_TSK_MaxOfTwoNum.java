package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab032_TSK_MaxOfTwoNum {
    public static void main(String[] args) {

        //Write a program to find the Maximum of Two Numbers.

        System.out.print("Enter Number 1 : ");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.print("Enter Number 2 : ");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        if (number1 > number2){
            System.out.println("Number 1 is Maximum");
        } else if (number2 > number1) {
            System.out.println("Number 2 is Maximum");
        }else {
            System.out.println("Both are equal");
        }
    }
}
