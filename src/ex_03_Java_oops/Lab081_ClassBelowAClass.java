package ex_03_Java_oops;

public class Lab081_ClassBelowAClass {
    public static void main(String[] args) {

        bird B1 = new bird();
        B1.birdName = "Sparrow";
        B1.birdAge = 10;

        B1.fly();

    }
}
class bird{
    String birdName;
    int birdAge;

    void fly(){
        System.out.println("Bird Flying");
    }
    void land(){
        System.out.println("Bird Lands");
    }
}
