package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab046_TSK_BonusSalary {

    public static void main(String[] args) {

        System.out.print("Enter you salary : ");
        Scanner salaryInput = new Scanner(System.in);
        double salary = salaryInput.nextDouble();

        System.out.print("Enter your year of experience : ");
        Scanner experienceInput = new Scanner(System.in);
        float experience = experienceInput.nextFloat();
        double bonus = 0;
        if(experience < 1){
            System.out.println("No Bonus !");
            System.exit(0);
        } else if (experience >= 1 && experience <= 3 ) {
            bonus = (5.0/100) * salary;
        } else if (experience >= 4 && experience <= 6 ) {
            bonus = (10.0/100) * salary;
        } else if (experience > 6) {
            bonus = (15.0/100) * salary;
        }

        System.out.println("Your bonus is : " + bonus);
        System.out.println("You Salary is :" + salary);
        System.out.println("Total Amount : "+ (salary + bonus));

    }

}
