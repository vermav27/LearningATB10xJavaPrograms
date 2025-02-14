package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab050_TSK_ConvertDaysIntoYearMonthDays {

    public static void main(String[] args) {

        //Convert Days into Years, Months, and Days.
        System.out.print("Enter no. of days to convert : ");
        Scanner sc = new Scanner(System.in);
        int totalDays = sc.nextInt();

        int numberOfYear = totalDays / 365;
        int daysleftFromYear = totalDays - (365 * numberOfYear);

        int numberOfMonth = daysleftFromYear / 30;
        int daysLeft = daysleftFromYear - (30 * numberOfMonth);

        System.out.println(numberOfYear + " Years " + numberOfMonth + " Months " + daysLeft + " Days ");


    }

}
