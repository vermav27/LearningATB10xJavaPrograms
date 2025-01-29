package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab029_TSK_FibonacciSeries {

    public static void main(String[] args) {
        System.out.print("How many fibonacci numbers you want ? ( Enter Integer greater than 0 ) : ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            System.out.println("You entered integer !");
            if(number > 0){
                int firstNum = 0;  //First digit of fibonacci series
                int secondNum = 1; //Second digit of fibonacci series
                System.out.print(firstNum +", "+ secondNum); //Printing first and second digit of fibonacci series

                //fibonacci logic
                for(int i = 2; i<number; i++){
                    int fibonacci = firstNum + secondNum;
                    firstNum = secondNum;
                    secondNum = fibonacci;
                    System.out.print(", "+ fibonacci);
                }
            }else{
                System.out.print(". But its less than 1. Exiting !");
            }
        }else{
            System.out.println("You have not entered integer. Exiting !");
        }
    }

}
