package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab033_TSK_VowelOrConsonant {

    public static void main(String[] args) {

        //Write a program to check if a Character is a Vowel or Consonant.
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        String character = sc.nextLine();
        if (character.length() > 1) {
            System.out.println("Exiting ! Please enter a single character");
        } else {

            if (character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
                System.out.println("This is a vowel");
            } else {
                System.out.println("This is a consonant");
            }

        }

    }
}