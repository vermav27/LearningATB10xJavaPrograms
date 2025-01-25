package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab025_TSK_Palindrome {

    public static void main(String[] args) {

        /*
        * Write a program to reverse a word and identify if it is a palindrome or not
        */

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word ( It is case sensitive ): ");
        String enteredWord = sc.nextLine();
        String wordAfterReverse = "";

        //Calculating length of entered word
        int wordLength = enteredWord.length()-1;

        //reversing the word and concatinating
        for(int i = wordLength ; i >= 0 ; i--){
            wordAfterReverse = wordAfterReverse + enteredWord.charAt(i);
        }
        System.out.println("Word after reverse is : "+ wordAfterReverse);

        //checking if the entered word is palindrome or not
        if(enteredWord.equals(wordAfterReverse)){
            System.out.println("Word " + enteredWord + " is palindrome.");
        }else{
            System.out.println("Word " + enteredWord + " is not palindrome.");
        }
    }
}
