package ex_02_Java_Advance;

public class Lab020_TSK_IncrementDecrement_OP {

    public static void main(String[] args) {

        //solve (--a + a++ + a--)
        int a = 20;
        /*
        --a = 19 --> a = 19
        a++ = 19 --> a = 20
        a-- = 20 --> a = 19
        adding 19 + 19 + 20 = 58
        */
        System.out.println(--a + a++ + a--);

    }

}
