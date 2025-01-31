package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab039_TSK_CharacterIsAlphabetOrNot {

    public static void main(String[] args) {

        //Write a program to check if a character is alphabet or not
        System.out.print("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        String fullString = sc.nextLine();
        if(fullString.length() > 1){
            System.out.println("Entered value is not a character its a string");
            System.exit(0);
        }else{
            char character = fullString.charAt(0);
            if(character >= 'a' && character <='z' || character >= 'A' && character <='Z'){

                System.out.printf("Character %c is a alphabet \n",character);
            }else{
                System.out.printf("Character %c is not a alphabet \n",character);
            }
        }
    }

}
