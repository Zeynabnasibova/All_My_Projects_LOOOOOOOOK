package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

public class Ex37 {
    /* 37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT  */
    public static void main(String[] args) {
     String str = "Java";
     String reverse = "";
     for(int i = str.length()-1; i >= 0 ; i--){
         reverse += str.charAt(i);
     }
        System.out.println(reverse);
    }
}
