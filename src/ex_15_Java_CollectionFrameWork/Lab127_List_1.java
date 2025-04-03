package ex_15_Java_CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Lab127_List_1 {
    public static void main(String[] args) {

        //List allows the duplicates

        //LIST
        System.out.println("-----------LIST---------------");
        List fruit1 = List.of("Orange","Apple","Orange","Mango");
        System.out.println(fruit1);
        //Now from the List we cannot add any element and not even we can delete from the list.
        //Thats why we use "ArrayList"

        System.out.println("-----------ARRAYLIST---------------");
        //ARRAYLIST
        ArrayList fruit2 = new ArrayList();
        fruit2.add("melons");
        fruit2.add("apple");
        fruit2.add("mango");
        fruit2.add("mango");
        fruit2.add(null);
        fruit2.add(20);
        fruit2.add(false);
        System.out.println("Fruit 2 array list ---> " + fruit2);
        fruit2.add(20);
        fruit2.remove(1);
        fruit2.remove("apple");
        fruit2.remove("mango"); // removes the first occurance
        System.out.println("Updated Fruit 2 array list ---> " + fruit2);
        System.out.println("Size of arraylist ---> " + fruit2.size());

        List Fruit3 = new ArrayList(); // Dynamic Dispatch : Father can be there in the born on child
        //here the child is Arraylist and father is List
        Fruit3.add("Apple");
        Fruit3.add("Guava");
        System.out.println(Fruit3);

        //Order is always maintained in the List
    }
}
