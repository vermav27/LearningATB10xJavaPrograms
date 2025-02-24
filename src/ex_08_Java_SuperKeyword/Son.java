package ex_08_Java_SuperKeyword;

public class Son extends Father {
    String bike;
    int money;

    public Son(String bike, int money) {
        this.bike = bike;
        this.money = money;
    }

    void sonProperty(){
        super.fatherProperty();
        System.out.println("I have " + this.bike + " and " + this.money);
    }

    void fatherProperty(){
        System.out.println("This is some property of father which son have.");
    }
}
