package ex_14_Java_Generics;

public class Lab124_Generics_Example1 {
    public static void main(String[] args) {
        int x = add(1,3);
        String y = add("1","3");
    }

    //So here the concept of polymorphism is used ( method overloading ) and now if we want to make
    //it a generic method We can use generics.
    public static Integer add(int a,int b){
        return a + b;
    }

    public static String add(String a,String b){
        return a +b;
    }
}
