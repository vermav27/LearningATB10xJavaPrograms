package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab047_TSK_GrossSalary {

    public static void main(String[] args) {

        System.out.print("Enter Basic Pay : ");
        Scanner payInput = new Scanner(System.in);
        double pay = payInput.nextDouble();

        System.out.print("Enter HRA : ");
        Scanner HRAInput = new Scanner(System.in);
        double hra = HRAInput.nextDouble();

        System.out.print("Enter DA : ");
        Scanner DAInput = new Scanner(System.in);
        double da = DAInput.nextDouble();

        float tax = 0f;
        double grossSalary = pay + hra + da;

        //Tax Slab
        if(grossSalary <= 1200000){
            tax = 0.0f;
        } else if (grossSalary > 1200000 && grossSalary <= 2000000) {
            tax = 20.0f;
        } else if (grossSalary > 2000000) {
            tax = 30.0f;
        }

        double taxAmount = tax/100 * grossSalary;
        System.out.println("Tax Percent : "+tax);
        System.out.println("Calculated tax : " + taxAmount);
        System.out.println("Gross Salary : " + grossSalary);
        double netSalary = grossSalary - taxAmount;
        System.out.println("Net Inhand Salary is : " + netSalary);
    }
}
