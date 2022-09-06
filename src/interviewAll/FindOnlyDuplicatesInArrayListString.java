package interviewAll;

import java.util.ArrayList;
import java.util.Arrays;

public class FindOnlyDuplicatesInArrayListString {

    /**
     * How to print only duplicates in String ArrayList?
     */
    public static void main(String[] args) {
      ArrayList<String>list = new ArrayList<String>(Arrays.asList("A","B","B","C","D"));
        System.out.println(duplicateChar(list));
    }
    public static String duplicateChar( ArrayList<String>list){ //Arrays.asList("A","B","B","C","D");

        String letter = "";// container  // ABCD

        for(int i = 0; i < list.size();i++){

            if(!letter.contains("" + list.get(i))){ //chek

                letter += "" + list.get(i);

            }

        }

        String duplicate = "";

        for(int i = 0; i < letter.length(); i++){
            int count = 0;
            for(int j = 0; j < list.size(); j++){
                if(letter.substring(i,i+1).equals(list.get(i))) {
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
