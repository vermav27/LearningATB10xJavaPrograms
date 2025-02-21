package ex_02_Java_Advance;

public class Lab072_TSK_InvertedPyramid {

    public static void main(String[] args) {

        int rows = 4;
        for(int i = rows; i > 0 ; i--){

            for(int j = 1 ; j <= rows - i ; j++ ){
                System.out.print( " ");
            }
            for(int k = 2*i-1 ; k >=1 ; k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
