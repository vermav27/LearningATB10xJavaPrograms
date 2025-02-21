package ex_02_Java_Advance;

import java.util.Scanner;

public class Lab074_TSK_SecondSmallest {

    public static void main(String[] args) {

        System.out.print("Enter length of array you want to store : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] a = new int[num];
        for(int i = 0 ; i <= num-1 ; i++){
            System.out.printf("Enter integer at location %d : ",i);
            Scanner sct = new Scanner(System.in);
            a[i] = sct.nextInt();
        }

        //Print array created
        for(int i = 0 ; i <= num-1 ; i++){
            System.out.println(a[i]);
        }

        //Sorting
        for(int i = 0 ; i <= num -1 ; i++){

            for(int k = 0 ; k < num-1 ; k++){

                if(a[k] > a[k+1]){
                    int temp = a[k+1];
                    a[k+1] = a[k];
                    a[k] = temp;
                }

            }

        }
        //Sorting Ends

        //Print value at second place of array
        System.out.println("Second smallest of array is :  " + a[1]);


    }

}
