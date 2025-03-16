package ex_13_Java_Exception;

public class Lab121_CustomException {
    public static void main(String[] args) {
        Lab121_Bank_Class icici = new Lab121_Bank_Class(130,"INR");
        Lab121_Bank_Class sbi = new Lab121_Bank_Class(200,"IN");
        int result = icici.add(sbi);
        System.out.println(result);
    }
}
