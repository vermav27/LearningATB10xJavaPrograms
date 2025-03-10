package ex_09_Java_Abstraction.Interface.B_Multiple_Inheritance_Solved;

public class Lab104_Interface_MultipleInheritanceSolved {

    public static void main(String[] args) {
        child c1 = new child();
        c1.money();
        //so here "money" function is with both father and mother class so we achieved multiple
        //inheritance using interface using "implements" keyword.
        //In the case where both mother and father have same name function then in the child class
        //its definition will be common. ( this is the thing in interface and this is how we achieve
        //multiple inheritance using interface).
        //In the above statement "c1.money" we cannot tell from which class this money is coming.
    }

}
