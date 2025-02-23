package ex_05_Java_Inheritance.B_MultiLevel;

public class Lab090_Multilevel_simpleExample {
    public static void main(String[] args) {

        System.out.println("----- Multilevel Inheritance -----");
        System.out.println("Grand father can access : ");
        //Multilevel Inheritance
        GrandFather G1 = new GrandFather();
        //Grand Father has access to his own property only
        G1.grandFatherFarmHouse();
        G1.grandFatherFlat();
        G1.grandFatherHome();
        //-----------
        System.out.println("-----");

        System.out.println("Father can access : ");
        Father F1 = new Father();
        //Father has access to his own property and grandfather property.
        F1.grandFatherFarmHouse();
        F1.grandFatherFlat();
        F1.grandFatherHome();
        F1.FatherFlat();
        F1.FatherHome();
        F1.shop();
        //-----------
        System.out.println("-----");

        System.out.println("Son can access : ");
        Son S1 = new Son();
        //Son has access to his own and father and grandfather property.
        S1.grandFatherFarmHouse();
        S1.grandFatherFlat();
        S1.grandFatherHome();
        S1.FatherFlat();
        S1.FatherHome();
        S1.Home();
        S1.Shop(); //Now Father and son both have shop, but this will point to the sons shop and if sons shop will not be there then it would be pointing to the father's shop.


    }
}
