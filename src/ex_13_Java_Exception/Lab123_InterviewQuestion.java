package ex_13_Java_Exception;

public class Lab123_InterviewQuestion {
    public static void main(String[] args) {
        //As we know that in Try/Catch/Finally. Finally will always be executed.
        //So what can be the situation when finally will not get executed.
        //So the situation is to use System.exit(0).

        int x = 10;
        int y = 0;
        try {
            y = x/10;
            System.out.println(y);
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The final Block");
        }

    }
}
