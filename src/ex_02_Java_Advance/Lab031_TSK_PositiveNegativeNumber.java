package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab031_TSK_PositiveNegativeNumber {

    public static void main(String[] args) {

        // Write a program to check if a number is positive or negative
        System.out.print("Enter a integer : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.printf("Number %d  is negative.",number);
        } else if (number == 0) {
            System.out.printf("Number %d is zero",number);
        } else{
            System.out.printf("Number %d is positive",number);
        }

    }

}
