package ex_11_Java_ENum.B_Example2;

public class Lab108_Enum_Example2 {
    public static void main(String[] args) {
        System.out.println(colors.BLUE.getCode());
    }
}

enum colors{
    //This is how we will define the enum.
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00"),
    YELLOW("#FFFF00");

    //Create a variable
    private String code;

    //Create a constructor
    colors(String code_c){
        this.code = code_c;
    }

    //create a get method to access the value
    String getCode(){
        return this.code;
    }
}
