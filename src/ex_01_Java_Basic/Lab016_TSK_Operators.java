package ex_01_Java_Basic;

public class Lab016_TSK_Operators {

    public static void main(String[] args) {

        int valueOfA = 10; //use of assignment operator
        int valueOfB = 20;

        //Arithmatic Operator
        int addValue = valueOfA + valueOfB ;
        System.out.println(addValue);
        int subValue = valueOfA - valueOfB ;
        System.out.println(subValue);
        int mulValue = valueOfA * valueOfB ;
        System.out.println(mulValue);
        int divValue = valueOfB /  valueOfA ;
        System.out.println(divValue);
        int modValue = valueOfB % valueOfA ;
        System.out.println(modValue);

        //Relational Operator
        boolean B1 = valueOfA < valueOfB ;
        System.out.printf("Expecting true !, Value is %b \n" ,B1);

        boolean B2 = valueOfA > valueOfB ;
        System.out.printf("Expecting false !, Value is %b \n",B2);

        boolean B3 = valueOfA <= valueOfB ;
        System.out.printf("Expecting true !, Value is %b \n",B3);

        boolean B4 = valueOfA >= valueOfB ;
        System.out.printf("Expecting false !, Value is %b \n",B4);

        boolean B5 = valueOfA == valueOfB ;
        System.out.printf("Expecting false !, Value is %b \n",B5);

        boolean B6 = valueOfA != valueOfB ;
        System.out.printf("Expecting true !, Value is %b \n",B6);

        //Logical Operator
        boolean B7 = true || false ;
        System.out.printf("Expecting true !, Value is %b \n",B7);

        boolean B8 = true && false ;
        System.out.printf("Expecting false !, Value is %b \n",B8);

        boolean B9 = !false ;
        System.out.printf("Expecting true !, Value is %b \n",B9);
    }
}
