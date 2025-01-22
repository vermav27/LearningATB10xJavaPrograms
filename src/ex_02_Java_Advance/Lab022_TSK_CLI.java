package ex_02_Java_Advance;

public class Lab022_TSK_CLI {

    public static void main(String[] args) {

        //Using ternary operator find out the maximum of two numbers
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);

        String result = val1 > val2 ? "value 1 is maximum" : "value 2 is maximum";
        System.out.println(result);

    }

}
