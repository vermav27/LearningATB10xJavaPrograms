package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab049_TSK_checkDivisibleBy5and11 {

    public static void main(String[] args) {

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%5 == 0 && number%11 == 0){
            System.out.println("Number is divisible by 5 and 11.");
        }else{
            System.out.println("Number is either not divisible by 5 or 11");
        }
    }
}
