package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab068_TSK_WhileFactorial {

    public static void main(String[] args) {

        System.out.print("Give number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long factorial = 1;
        int i = number;
        while(i>=1){
            factorial = factorial * i;
            i--;
        }
        System.out.println("Factorial is : "+ factorial);

    }

}
