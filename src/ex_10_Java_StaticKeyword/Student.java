package ex_10_Java_StaticKeyword;

public class Student {
    int age;
    static String course = "Automation Blueprint Batch";

    Student(int age_c){
        this.age = age_c;
    }

    static void study(){
        System.out.println("This is my course : " + course);
    }

}
