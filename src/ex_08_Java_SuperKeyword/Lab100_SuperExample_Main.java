package ex_08_Java_SuperKeyword;

public class Lab100_SuperExample_Main {
    public static void main(String[] args) {
        Son s1 = new Son("Hayabusa",500);
        s1.sonProperty();

        //Here son class also have "fatherProperty" function.
        //Father class also have "fatherProperty" function.
        //But inside the "sonProperty" i am calling "fatherProperty" function.
        //so if i call like " fatherProperty() " , it will call the function
        //which is with in the son class.
        //But if i call like " super.fatherProperty() ", it will call the function
        //which is in the parent class, that is father class.
    }
}
