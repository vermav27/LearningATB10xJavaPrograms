package ex_05_Java_Inheritance.C_Hierarchical;

public class Lab091_Hierarchical_SimpleExample {
    public static void main(String[] args) {

        System.out.println("----- Hierarchical Inheritance -----");
        System.out.println("Daughter 1 can access : ");
        //Daughter can access her and father home only
        Daughter1 d1 = new Daughter1();
        d1.daughter1Home();
        d1.fatherHome();
        System.out.println("-----");

        System.out.println("Son 1 can access : ");
        //Son 1 can access his home and father home only
        Son1 s1 = new Son1();
        s1.son1Home();
        s1.fatherHome();
        System.out.println("-----");

        System.out.println("Son 2 can access : ");
        //Son 2 can access his home and father home only
        Son2 s2 = new Son2();
        s2.son2home();
        s2.fatherHome();

    }
}
