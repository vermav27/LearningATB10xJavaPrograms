package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab026_TSK_ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to be reversed : ");
        if(sc.hasNextInt() ==true){
            int value = sc.nextInt();
            int reversedValue = 0;
            while(value != 0){
                int lastDigit = value%10; // taking out last digit of number
                reversedValue = reversedValue * 10 + lastDigit;  //making number reverse
                value = value / 10; //taking out rest of number to again extracting out last value
            }
            System.out.println("This is the reversed value : " + reversedValue);
        }else{
            System.out.println("Please Enter Integer !");
        }
    }
}
