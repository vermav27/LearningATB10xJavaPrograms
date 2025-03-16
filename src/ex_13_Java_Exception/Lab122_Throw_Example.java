package ex_13_Java_Exception;

public class Lab122_Throw_Example {
    static void validate(int age){
        if(age<17){
            try {
                throw new Exception("Less Age Exception");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Age is : "+ age);
        }
    }

    public static void main(String[] args) {
        validate(19);
    }
}

