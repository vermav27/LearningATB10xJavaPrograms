package ex_02_Java_Advance;

public class Lab075_ArrayDeclaration {

    public static void main(String[] args) {

        //1-D Array
        //Type 1 - array with pre defined elements
        int[] marks = {10,20,30,40,50};

        //Type 2
        int[] students = new int[5];


        //2-D Array - Declaration
        int[][] x = {{1,2},{3,4},{5,6}};

        //2-D Array
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 1;
        numbers[0][2] = 1;

        numbers[1][0] = 2;
        numbers[1][1] = 2;
        numbers[1][2] = 2;

        numbers[2][0] = 3;
        numbers[2][1] = 3;
        numbers[2][2] = 3;

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

    }

}
