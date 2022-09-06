package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

public class Ex60 {

    public static void main(String[] args) {
        /*
        Write a Java program to find the penultimate (next to last) word of a sentence.
Sample Output:
Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
         */
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String [] arrSentence = sentence.split(" ");
        String newSentence = arrSentence[arrSentence.length - 2];
        System.out.println(newSentence);//  lazy
    }
}
