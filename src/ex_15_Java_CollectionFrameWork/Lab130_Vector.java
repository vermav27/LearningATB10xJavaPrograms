package ex_15_Java_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab130_Vector {
    public static void main(String[] args) {

        //We generally do not use vector due to old legacy
        //Vector are syncronised in nature. So where ever we see syncronised word we
        //do not use that. all the operations here are done in one by one manner.

        Vector V1 = new Vector();
        V1.add("Hello world");
        V1.add(134);
        V1.add(false);
        V1.add(500);
        V1.add(62.19);
        V1.add(500);
        System.out.println("Vector list V1 ---> " + V1);

        System.out.println("Is contains 500 ? ---> " + V1.contains(500));
        System.out.println("Whats the size ? ---> "+V1.size());
        System.out.println("Whats the index od false ? ---> " + V1.indexOf(false));
        System.out.println("Reversed Array List ---> " + V1.reversed());
        System.out.println("Is List empty ? ---> " + V1.isEmpty());
        System.out.println("Last index of 500 ? --> " + V1.lastIndexOf(500));
        V1.remove(1);
        System.out.println(V1);
    }
}
