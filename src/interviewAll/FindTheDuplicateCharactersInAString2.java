package interviewAll;

public class FindTheDuplicateCharactersInAString2 {
    public static void main(String[] args) {
String str = "AAAAABBBCCDEE";
        System.out.println(duplicateChar(str));
    }
    public static String duplicateChar(String word){ //String str = "AAAAABBBCCDEE";

        String letter = "";// container  // ABCDE

        for(int i = 0; i < word.length();i++){

            if(!letter.contains("" + word.charAt(i))){ //chek

                letter += "" + word.charAt(i);

            }

        }

        String duplicate = "";

        for(int i = 0; i < letter.length(); i++){
            int count = 0;
            for(int j = 0; j < word.length(); j++){
                if(letter.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if(count > 1){

                duplicate += letter.charAt(i);
            }

        }

        return duplicate;


    }
}
