package ex_15_Java_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Lab128_ArrayList {
    public static void main(String[] args) {
        List L1 = new ArrayList();
        L1.add("Hello world");
        L1.add(134);
        L1.add(false);
        L1.add(500);
        L1.add(62.19);
        L1.add(500);
        System.out.println("Array list L1 ---> " + L1);

        System.out.println("Is contains 500 ? ---> " + L1.contains(500));
        System.out.println("Whats the size ? ---> "+L1.size());
        System.out.println("Whats the index od false ? ---> " + L1.indexOf(false));
        System.out.println("Reversed Array List ---> " + L1.reversed());
        System.out.println("Is List empty ? ---> " + L1.isEmpty());
        System.out.println("Last index of 500 ? --> " + L1.lastIndexOf(500));

        //Print using loop
        for (int i = 0 ; i < L1.size() ; i++){
            System.out.println(L1.get(i));
        }

    }
}
