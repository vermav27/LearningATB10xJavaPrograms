package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab042_TSK_CheckPalindrome {

    public static void main(String[] args) {

        //Check if a number is palindrome or not.
        System.out.printf("Enter a no. : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int originalNumber = value;
        int reversedNumber = 0;
        int digit = 0;

        while(value!=0){
            digit = value % 10;
            reversedNumber = reversedNumber * 10 + digit;
            value = value / 10;
        }
        if(originalNumber == reversedNumber){
            System.out.println("Entered number is a palindrome");
        }else{
            System.out.println("Entered number is not a palindrome");
        }
    }
}
