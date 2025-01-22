package ex_02_Java_Advance;

public class Lab021_TSK_CLI {

    public static void main(String[] args) {

        //inputs from CLI ( command line interface )
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);

        System.out.println("Name is : "+ name);
        System.out.println("Age is : "+ age);
        System.out.println("Salary is : "+ salary);

    }

}
