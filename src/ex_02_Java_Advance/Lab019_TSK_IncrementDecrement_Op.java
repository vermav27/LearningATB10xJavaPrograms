package ex_02_Java_Advance;

public class Lab019_TSK_IncrementDecrement_Op {

    public static void main(String[] args) {

        //solve (++a + a++ + a++)
        int a = 10;
        /*
        ++a = 11 --> a = 11
        a++ = 11 --> a = 12
        a++ = 12 --> a = 13
        adding 11 + 11 + 12 = 34
        */
        System.out.println(++a + a++ + a++);

    }

}
