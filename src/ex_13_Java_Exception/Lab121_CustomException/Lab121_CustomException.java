package ex_13_Java_Exception.Lab121_CustomException;

public class Lab121_CustomException {
    public static void main(String[] args) {
        Bank icici = new Bank(130,"INR");
        Bank sbi = new Bank(200,"IN");
        int result = icici.add(sbi);
        System.out.println(result);
    }
}
