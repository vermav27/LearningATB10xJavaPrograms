package ex_02_Java_Advance;

public class Lab073_TSK_Sorting {
    public static void main(String[] args) {
        int number[] = {12, 34, 10, 1, 100, 3, 4, 32};
        int numberLength = number.length - 1;
        for(int i = 0 ; i < numberLength ; i++){

           for(int k = 0 ; k < numberLength ; k++){

               if(number[k] > number[k+1]){

                   int temp = number[k+1];
                   number[k+1] = number[k];
                   number[k] = temp;

               }

           }

        }

        //Print sorted array
        for (int j = 0 ; j <= numberLength ; j++){
            System.out.println(number[j]);
        }
    }
}
