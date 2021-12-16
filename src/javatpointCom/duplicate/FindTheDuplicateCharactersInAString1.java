package javatpointCom.duplicate;

public class FindTheDuplicateCharactersInAString1 {
    /**
     * Program to find the duplicate characters in a string
     */
    /**
     * How to Find Repeated Characters in Given String with Count in Java? [Solved]
     */


    public static void main(String[] args) {
duplicatChar();
    }
    public static void duplicatChar(){

        String str = "smallest tik tik";//s m
        //             m  a

        char duplicatChar = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    if (duplicatChar != str.charAt(i)) {

                        count++;

                        duplicatChar = str.charAt(i);

                        System.out.println("Duplicate Charaacter is " + duplicatChar);
                        break;
                    }

                }
            }
        }
        System.out.println("Number of duplicate character is " + count);
    }

}