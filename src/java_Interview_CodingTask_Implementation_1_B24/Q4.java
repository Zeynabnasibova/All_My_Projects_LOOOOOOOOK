package java_Interview_CodingTask_Implementation_1_B24;

public class Q4 {
/*
Q4: String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==>"DEF";


 */
    public static void main(String[] args) {


        System.out.println(findTheUnique("AAABBBCCCDEF"));
    }

    public static String findTheUnique(String str){

       // String str = "AAABBBCCCDEF";

        String unique = "";

        for(int i = 0; i < str.length(); i++){//

            int count = 0;

            for(int j = 0; j < str.length(); j++){

                if(str.charAt(i) == str.charAt(j)){

                    count++;

            }

            }
            if(count == 1){

                unique += str.charAt(i);

            }

        }
       return unique;


    }
}
