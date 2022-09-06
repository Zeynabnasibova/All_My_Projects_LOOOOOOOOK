package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

public class Ex59 {

    public static void main(String[] args) {

/*
59. Write a Java program to convert a given string into lowercase. Go to the editor
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.

 */
        String sentence = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.".toLowerCase();
        String newSentence = sentence.toLowerCase();
        System.out.println(newSentence); // the quick brown fox jumps over the lazy dog.
        System.out.println(sentence);
    }
}
