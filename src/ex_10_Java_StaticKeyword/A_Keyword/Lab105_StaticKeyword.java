package ex_10_Java_StaticKeyword.A_Keyword;

public class Lab105_StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(43);

        //So this is how we generally call the class variable by creating object.
        System.out.println(s1.age);

        /*
        Static keyword means that is "common to all". That means it can be called without
        creating any object.
         */
        System.out.println(Student.course); //Calling variable directly when static keyword is there.
        Student.study(); //Calling function directly when static keyword is there.

    }
}
