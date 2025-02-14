package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab051_TSK_DetermineDomain {

    public static void main(String[] args) {

        //Determine the Type of Website Based on Domain (.com, .org, .edu, .gov, .inf, .net.)
        System.out.print("Enter website to determine the type of domain : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();

        int lengthOfString = website.length();
        int firstPosition = lengthOfString - 4;
        String domain = "";

        for(int i = firstPosition;i<lengthOfString;i++){
            domain = domain + website.charAt(i);
        }

        if(domain.equals(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (domain.equals(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (domain.equals(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (domain.equals(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (domain.equals(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (domain.equals(".inf")) {
            System.out.println("The website type is: Informational website");
        } else{
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
