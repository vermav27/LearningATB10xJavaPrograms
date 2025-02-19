package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab069_TSK_RightAngledTriangle {

    public static void main(String[] args) {

        System.out.print("Enter lines you want to print : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0 ; i < number ; i++){

            for(int j = 0 ; j <= i ; j++){

                System.out.print("*");

            }

            System.out.print("\n");

        }

    }

}
