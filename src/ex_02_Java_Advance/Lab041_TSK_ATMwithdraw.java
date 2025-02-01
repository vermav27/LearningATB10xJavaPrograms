package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab041_TSK_ATMwithdraw {

    public static void main(String[] args) {

        int fixedAmount = 10000;
        System.out.print("Enter amount you wants to withdraw : ");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.println("This is not a valid input. Exiting....");
            System.exit(0);
        }

        int amount = sc.nextInt();

        if(amount == 0){
            System.out.println("Amount 0 cannot be withdrawn. Exiting....");
            System.exit(0);
        } else if(amount < 0) {
            System.out.println("Invalid Input. Exiting....");
            System.exit(0);
        } else if (amount > 10000) {
            System.out.println("Amount exceeding limit of 10000");
            System.exit(0);
        } else if ( amount % 100 != 0 ){
            System.out.println("Amount should be a multiple of 100");
            System.exit(0);
        }
        System.out.printf("Amount %d withdraw in process....\n",amount);

        int updatedBalance = fixedAmount - amount;
        System.out.println("Success !");
        System.out.printf("Transaction of amount %d is completed. \n",amount);
        System.out.println("Updated Balance : " + updatedBalance);

    }

}
