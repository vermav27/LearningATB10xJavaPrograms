package ex_02_Java_Advance;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab070_TSK_InvertedRightAngleTriangle {

    public static void main(String[] args) {

        System.out.print("Enter the no. of line you wanna print : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0 ; i < number ; i++){

            for(int j = number ; j > i ; j--){

                System.out.print("*");

            }
            System.out.print("\n");

        }

    }

}
