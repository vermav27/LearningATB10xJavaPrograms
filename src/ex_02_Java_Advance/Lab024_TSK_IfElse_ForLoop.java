package ex_02_Java_Advance;

public class Lab024_TSK_IfElse_ForLoop {

    public static void main(String[] args) {

        //calculate the number of vowels and consonants in string
        String name = "Pramod";
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        int nameLength = name.length()-1;
        for(int x = 0 ; x <= nameLength ; x++){
            if(name.charAt(x) == 'a' || name.charAt(x) == 'e' || name.charAt(x) == 'i' || name.charAt(x) == 'o' || name.charAt(x) == 'u' ){
                numberOfVowels++;
            }
            else{
                numberOfConsonants++;
            }
        }
        System.out.println("Number of Vowels : " + numberOfVowels);
        System.out.println("Number of Consonants : " + numberOfConsonants);


    }

}
