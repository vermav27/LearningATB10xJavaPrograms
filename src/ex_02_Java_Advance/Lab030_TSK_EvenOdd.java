package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab030_TSK_EvenOdd {
    public static void main(String[] args) {
        //Write a program to identify if a number is even or odd
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("This number is Even.");
        }else {
            System.out.println("This number is odd.");
        }
    }
}
