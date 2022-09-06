package codingPractice.w3resourceTask.basicPart1.mart2.basicPart1;
import java.util.Scanner;
public class N9 {
    /*
    9.
    38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
        int spaces = 0;
        int numbers = 0;
        Expected Output
        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
        letter: 23
        space: 9
        number: 10
        other: 6 */
        public static void main(String [] args ) {
            Scanner input = new Scanner(System.in);
            int letters = 0;
            int spaces = 0;
            int numbers= 0;
            int characters = 0;
            System.out.println("Enter your sentence");
            String sentence = input.nextLine();


            for(int i = 0; i < sentence.length(); i++){
                if(Character.isLetter(sentence.charAt(i))){
                    letters++;
                }else if(Character.isSpaceChar(sentence.charAt(i))) {
                    spaces++;
                } else if(Character.isDigit(sentence.charAt(i))){
                    numbers++;
                }else{
                    characters++;
                }
            }

            System.out.println(letters);
            System.out.println(spaces);
            System.out.println(numbers);
            System.out.println(characters);
        }

}
