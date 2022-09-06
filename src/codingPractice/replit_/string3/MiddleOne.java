package codingPractice.replit_.string3;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {

        /*
        You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a

      javav ==> v

Single character, print that character 3 times
      # ==> ###

      q ==> qqq

When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av

     apples ==> pl

     #$%^&* ==> %^

2 characters, print those 2 characters twice
      @@ ==>@@@@

      $$ ==>$$$$

      hi ==> hihi
         */

        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();

        if(word.length()% 2 != 0 && word.length() >= 3){

            String middleLeter = word.substring(word.length()/2);
            System.out.println(middleLeter);

        }else if(word.length()==1){

            System.out.println(word + word + word);
        }else if(word.length()%2 == 0 && word.length() >= 4){
            String middleTwo = word.substring(word.length()/2-1,word.length()/2 +1);
            System.out.println(middleTwo);
        }else if(word.length()==2){

            String twice = word.concat(word);

            System.out.println(twice);


        }
    }
}
