package ex_07_Java_Encapsulation.B_SolutionExample;

public class Lab096_LoginClass_Main {
    public static void main(String[] args) {
        LoginClass L1 = new LoginClass("admin","passcode123");
        //Now as in the login class data variables are private in nature
        //so i cannot access them using "L1.username" or "L1.password" directly
        //But now i can access them indirectly using getter and setter function
        //Thats the only way to access and in that function we can set any type of validation.

        boolean isAuthorised = true;
        boolean isAdmin = true;

        //Now if i want to access the username and i am not authorised.
        String userNameAccess1 = L1.getUsername(false);
        System.out.println(userNameAccess1);

        //Now if i want to access the username and i am authorised.
        String userNameAccess2 = L1.getUsername(true);
        System.out.println(userNameAccess2);

        //Now if i want to change the username and i am not authorised.
        L1.setUsername("vineet",false);

        //Now if i want to change the username and i am authorised.
        L1.setUsername("kunal",true);
        String userNameAccess3 = L1.getUsername(true);
        System.out.println(userNameAccess3);

        System.out.println("-----------");

        //Now if i want to access the password and i am not authorised.
        String passwordAccess1 = L1.getPassword(false);
        System.out.println(passwordAccess1);

        //Now if i want to access the password and i am authorised.
        String passwordAccess2 = L1.getPassword(true);
        System.out.println(passwordAccess2);

        //Now if i want to change the password and i am not authorised.
        L1.setPassword("vineet123",false);

        //Now if i want to change the username and i am authorised.
        L1.setPassword("kunal123",true);
        String passwordAccess3 = L1.getPassword(true);
        System.out.println(passwordAccess3);

    }
}
