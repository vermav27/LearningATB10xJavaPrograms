package ex_04_Java_Constructor;

public class Lab085_CarClass_Main {
    public static void main(String[] args) {
        //car 1 details
        Lab084_CarClass car1 = new Lab084_CarClass();
        car1.modelName = "Tesla";
        System.out.println("car 1 model : " + car1.modelName);
        System.out.println("car 1 make : " +car1.make);
        System.out.println("car 1 company name : " +car1.companyName);

        //car 2 details
        Lab084_CarClass car2 = new Lab084_CarClass();
        System.out.println("car 2 model : " + car2.modelName);
        System.out.println("car 2 make : " +car2.make);
        System.out.println("car 2 company name : " +car2.companyName);


    }
}
