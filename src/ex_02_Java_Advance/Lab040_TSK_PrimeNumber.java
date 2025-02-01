package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab040_TSK_PrimeNumber {

    public static void main(String[] args) {

        System.out.print("Enter number to check if it is a prime number or not : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            if(number>0){
                //changing flag value once number is divisible by any number
                int flag = 0;
                for(int i = 2 ; i<number ; i++){
                    if(number%i == 0){
                        flag = 1;
                        break;
                    }else{
                        flag = 0;
                    }
                }
                //Comparing flag value
                if(flag==1){
                    System.out.println("Number is not prime.");
                }else{
                    System.out.println("Number is prime.");
                }

            }else{
                System.out.println("You entered a negative value.");
            }
        }else{
            System.out.println("Invalid Input");
        }

    }

}
