package interviewAll;

public class FindTheUniqueCharactersInAString_ {
    /**
     * find the unique characters in a string
     */
 /*
    Q4: String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==>"DEF";
     */
    public static void main(String[] args) {


        System.out.println(findTheUnique("AAABBBCCCDEF"));
    }

    public static String findTheUnique(String letter) {

        String unique = "";
        for (int i = 0; i < letter.length(); i++) {
            int count = 0;
            for (int j = 0; j < letter.length(); j++) {
                if (letter.charAt(i) == letter.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += letter.charAt(i);
            }
        }
        return unique;
    }

}