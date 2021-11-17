package saimDayByDay.day39_WrapperClass;

public class CharacterMethods {

    public static void main(String[] args) {
        /*
        to find if a character was uppercase
        loop through character
        char >= 'A' and char <= 'Z'
         */


        System.out.println(Character.isUpperCase('a'));//false
        System.out.println(Character.isUpperCase('Z'));//true,wrapper class method
        System.out.println(Character.isLowerCase('b'));

        System.out.println(Character.isDigit('3'));

        System.out.println(Character.isLetterOrDigit('8'));

        for(char ch = 'A';ch <= 'Z';ch++){

            System.out.print(ch + ", ");
        }

        

    }
}
