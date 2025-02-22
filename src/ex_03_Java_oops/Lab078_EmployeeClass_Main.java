package ex_03_Java_oops;

public class Lab078_EmployeeClass_Main {
    public static void main(String[] args) {

        //Here first "Lab077_EmployeeClass" is where the class loads.
        //Here "E1" is the object reference.
        //Here "new Lab077_EmployeeClass();" is the object created.

        Lab077_EmployeeClass E1 = new Lab077_EmployeeClass();
        Lab077_EmployeeClass E2 = new Lab077_EmployeeClass();

        E1.name = "Vineet Verma";
        E1.gender = "Male";
        E1.salary = 20;

        E2.name = "Rupakshi Sharma";
        E2.gender = "Female";
        E2.salary = 30;

    }
}
