package ex_09_Java_Abstraction.Interface.B_Multiple_Inheritance_Solved;

public class child implements Father,Mother{
    @Override
    public void money() {
        System.out.println("Money = 2500$");
    }

    @Override
    public void motherwork() {
        System.out.println("Mother Work");
    }

    @Override
    public void fatherWork() {
        System.out.println("Father Work");
    }
}
