package ex_14_Java_Generics;

public class Lab125_Generics_Example2 {
    public static void main(String[] args) {
        add(1,"3");
    }

    //We can make our function generic using anykeyword in the function defination
    //here "T" can be any word.
    //This concept is rarely used.
    public static <T> T add(T a,T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
