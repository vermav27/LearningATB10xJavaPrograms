package ex_12_Java_WrapperClass;

public class Lab111_WrapperClassConversion_Example2 {
    public static void main(String[] args) {
        //changed int to string
        Integer x = 10;
        String y = x.toString();
        System.out.println(y);

        //parsing string to integer
        String number = "20";

        //Wrapper conversion
        Integer num2Int = Integer.parseInt(number);
        System.out.println(num2Int);

        //Primitive conversion
        int num1 = Integer.parseInt(number);
        System.out.println(num1);

        //Max and min value
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
