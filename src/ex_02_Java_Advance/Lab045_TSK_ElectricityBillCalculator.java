package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab045_TSK_ElectricityBillCalculator {

    public static void main(String[] args) {

        System.out.print("Enter Units Consumed : ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;

        if(units <= 100){
            bill = units * 0.50;
        } else if (units >= 101 && units <= 200) {
            bill = units * 0.75;
        } else if (units >= 201 && units <= 300) {
            bill = units * 1.20;
        } else if (units > 300) {
            bill = units * 1.50;
        }

        System.out.println("Your bill is : INR " + bill);

    }

}
