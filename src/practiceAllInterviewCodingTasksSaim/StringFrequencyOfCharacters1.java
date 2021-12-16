package practiceAllInterviewCodingTasksSaim;

public class StringFrequencyOfCharacters1 {
    /*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

solution 1:
 */

    public static String frequencyOfChar(String str){

        String letter = "";// container
        for(int i = 0; i < str.length(); i++){

            if(!letter.contains("" + str.charAt(i))){

                letter += str.charAt(i);

            }
        }

        String result = "";

        for(int i = 0; i < letter.length(); i++){

        int count = 0;

        for(int j = 0; j < str.length(); j++){

            if(letter.charAt(i) == str.charAt(j)){

                count++;
            }
        }
         result  += letter.charAt(i) + "" + count;
        }

       return result;
    }

    public static void main(String[] args) {
String str = "AAABBCDD" ;
        System.out.println(frequencyOfChar(str));
    }



}
