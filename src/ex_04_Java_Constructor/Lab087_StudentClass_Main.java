package ex_04_Java_Constructor;

import java.sql.SQLOutput;

public class Lab087_StudentClass_Main {
    public static void main(String[] args) {
        Lab086_StudentClass Student1 = new Lab086_StudentClass("Shyam",45);
        Lab086_StudentClass Student2 = new Lab086_StudentClass("Tushar",34);

        System.out.println("Name of student 1 : " + Student1.name);
        System.out.println("Age of student 1 : " + Student1.age);
    }
}
