package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab066_TSK_TableOFNumber {

    public static void main(String[] args) {
        System.out.print("Give number to print table : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i<=10 ; i++ ){
            System.out.printf("%d * %d = %d \n",number,i,number*i);
        }
    }

}
