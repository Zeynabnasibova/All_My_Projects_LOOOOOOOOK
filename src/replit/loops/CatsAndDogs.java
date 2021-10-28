package replit.loops;
import java.util.Scanner;
public class CatsAndDogs {


    /*
    Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true

Example:

input: catcat
output: false

Example:

input: cat-cheetah-dog-cat
output: false
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.next();
        int catCount = 0;
        int dogCount = 0;
        for(int i = 0;i < str.length()-2; i++){
            if(str.substring(i,i + 3).equals("cat")){
                catCount++;
            }else if(str.substring(i,i+3).equals("dog")){
                dogCount++;

            }

        }
        if(catCount == dogCount){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}
