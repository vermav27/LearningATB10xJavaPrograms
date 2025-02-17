package ex_02_Java_Advance;

public class Lab053_TSK_StringFunctions {

    public static void main(String[] args) {

        String string1 = "Hello ! This is my world.";
        String string2 = "Hello ! This is my world.";
        String string3 = new String("This is the tester's playground");
        String string4 = new String("This is the tester's playground");
        String string5 = new String("Hello ! This is my world.");

        // 1. charAt()
        char singleCharacter = string1.charAt(6);
        System.out.println(" \"Charat\" practice : " + singleCharacter);

        // 2. concat()
        String concatString = "\"concat\" practice Attach with me......";
        System.out.println(concatString.concat(string1));

        // 3. contains()
        boolean isContainHello = false;
        isContainHello = string1.contains("Hello");
        System.out.println("\"Contain\" practice : " + isContainHello);

        // 4. equals()
        boolean isEquals = string1.equals(string2);
        System.out.println("Use of equals : " + isEquals);

        boolean equalOperator = (string1 == string5);
        System.out.println("Equal Operator : "+equalOperator);

        // 5. equalsIgnoreCase()
        String s1 = "Hello";
        String s2 = "hello";
        boolean s1s2Equal = s1.equalsIgnoreCase(s2);
        System.out.println("\"Practice\" equalsIgnoreCase : "+ s1s2Equal);

        // 6. indexOf()
        int indexOfIs = string1.indexOf("is");
        System.out.println("Placement of \"is\" is : " + indexOfIs);

        // 7. length()
        int lengthOfString = string3.length();
        System.out.println("Length of string is : "+lengthOfString);

        // 8. replace( , )
        System.out.println(string2.replace("my","our"));

        // 9. split()
        String splitArray[] = string4.split(" ");
        System.out.println(splitArray[0]);
        System.out.println(splitArray[1]);
        System.out.println(splitArray[2]);
        System.out.println(splitArray[3]);
        System.out.println(splitArray[4]);

        // 10. substring( , )
        //Hello ! T h  i  s     i  s     m  y  w  o  r  l  d  .
        //012345678 9 10  11 12 13 14 15 16 17 18 19 20 21 22 23
        String s3 = string5.substring(8,12);
        System.out.println("\"Substring\" : "+s3);

        // 11. toLowerCase()
        String s4 = "HELLO";
        System.out.println(s4.toLowerCase());

        // 12. toUpperCase()
        String s5 = "vineet";
        System.out.println(s5.toUpperCase());

        // 13. replaceAll()
        System.out.println(string5);
        System.out.println(string5.replaceAll("is","our"));

        // 14. startsWith()
        System.out.println("\"Starts with\" : "+ string1.startsWith("Hello"));
        System.out.println("\"Starts with\" : "+ string1.startsWith("llo"));

        // 15. endsWith()
        System.out.println("\"Ends with\" original string : " + string2);
        System.out.println("Ends with \"world.\" : " + string2.endsWith("world."));
        System.out.println("Ends with \"wor\" : " + string2.endsWith("wor"));

        // 16. isEmpty()
        System.out.println(string2);
        System.out.println("Is empty : " + string2.isEmpty());

        // 17. trim()
        String s6 = "   Happy Birthday   ";
        System.out.println(s6.trim());

        // 18. compareTo()
        System.out.println(" String 1 : " + string1);
        System.out.println(" String 2 : " + string2);
        System.out.println(" String 5 : " + string5);
        System.out.println("\"Compare to\" string 1 with string 2 : " + string1.compareTo(string2));
        System.out.println("\"Compare to\" string 1 with string 5 : " + string1.compareTo(string5));
        System.out.println("\"Equals to\" string 1 with string 2 :" + string1.equals(string2));
        System.out.println("\"Equals to\" string 1 with string 5 :" + string1.equals(string5));
        System.out.println("\"Equals operator\" string 1 with string 2 :" + (string1 == string2));
        System.out.println("\"Equals operator\" string 1 with string 5 :" + (string1 == string5));

        // 19. compareToIgnoreCase()
        String s7 = "THis iS caKE";
        String s8 = "thIS Is CAke";
        System.out.println("EqualsTo when compareToIgnoreCase not implemented : " + s7.equals(s8));
        System.out.println("EqualsTo when compareToIgnoreCase not implemented : " + s7.compareToIgnoreCase(s8));

        // 20. lastIndexOf()
        //Hello ! T h  i  s     i  s     m  y  w  o  r  l  d  .
        //012345678 9 10  11 12 13 14 15 16 17 18 19 20 21 22 23
        System.out.println("String 5 : "+string5);
        System.out.println("\" Last Index Of \" of s of string5 : " + string5.lastIndexOf("s"));

        // 21. repeat()
        System.out.println(" \"Repeat\" : " + string1.repeat(3));

        // 22. StringBuilder
        StringBuilder sb = new StringBuilder("HI !");
        System.out.println(sb);
        sb.append(" This is my world.");
        System.out.println(sb);



    }

}
