package ex_07_Java_Encapsulation.B_SolutionExample;

public class LoginClass {
    private String username;
    private String password;

    public String getUsername(boolean isAuthorised) {
        if(isAuthorised){
            return username;
        }else{
            return "Not Authorised to get username.";
        }
    }

    public void setUsername(String usr, boolean isAdmin) {
        if(isAdmin){
            this.username = usr;
        }else {
            System.out.println("You are not admin ! Not allowed to set username.");
        }
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin){
            return password;
        }else {
            return "You are not admin. You are not allowed to see the password.";
        }
    }

    public void setPassword(String pwd,boolean isAdmin) {
        if(isAdmin){
            this.password = pwd;
        }else{
            System.out.println("You are not admin ! Not allowed to set password.");
        }
    }

    LoginClass(String usr, String pwd){
        this.username = usr;
        this.password = pwd;
    }

}
