package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab043_TSK_Armstrong {

    public static void main(String[] args) {

        System.out.print("Enter a number to check if it is a armstrong number or not : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num2 = number;
        int originalNumber = number;
        double sumOfPowerOfDigit = 0;
        int power = 0;

        //Calculating the number of digit ( which is also be used as power of digits )
        while(number  != 0){
            number = number/10;
            power++;
        }

        //Calculating the sum of the power of each digit to calculate armstrong number
        while(num2 != 0){
            int digit = num2%10;
            sumOfPowerOfDigit = sumOfPowerOfDigit + (Math.pow(digit,power));
            num2 = num2/10;
        }
        System.out.println("Number after calculation is : " + sumOfPowerOfDigit);

        //Checking if a number is armstrong or not.
        if(originalNumber == sumOfPowerOfDigit){
            System.out.println("This is armstrong number.");
        }else{
            System.out.println("This is not an armstrong number.");
        }
    }
}
