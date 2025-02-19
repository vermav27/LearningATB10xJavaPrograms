package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab064_TSK_Factorial {

    public static void main(String[] args) {

        System.out.print("Enter number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long factorial = 1;
        for(int i = number ; i >= 1 ; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial is : "+ factorial);

    }

}
