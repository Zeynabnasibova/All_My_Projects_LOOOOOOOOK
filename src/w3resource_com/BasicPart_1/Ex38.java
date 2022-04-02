package w3resource_com.BasicPart_1;

import java.util.Scanner;
public class Ex38 {
    /*38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str = input.nextLine();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        char [] chArr = str.toCharArray();//converting string to char array
       // String [] strArr = str.split("");//converting String to String array
        for(int i = 0; i < str.length();i++){
            if(Character.isLetter(chArr[i])){
                letter++;
            }else if(Character.isDigit(chArr[i])){
                number++;
            }else  if(Character.isSpaceChar(chArr[i])){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
/**public class Practice {
 public static void main(String [] args){
 Scanner input = new Scanner (System.in);
 System.out.println("Enter your sentence");
 String str = input.nextLine();
 int letter = 0;
 int space = 0;
 int number = 0;
 int other = 0;
 for(int i = 0; i < str.length(); i ++){
 if(Character.isLetter(str.charAt(i))){
 letter++;
 }else if(Character.isSpaceChar(str.charAt(i))){
 space++;
 }else if(Character.isDigit(str.charAt(i))){
 number++;
 }else{
 other++;
 }
 }
 System.out.println("letter = " + letter);
 System.out.println("space = " + space);
 System.out.println("number = " + number);
 System.out.println("other = " + other);
 }
 }

 */
