package ex_02_Java_Advance;

public class Lab062_TSK_While_SumOfTenNaturalNumbers {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

}
