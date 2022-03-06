package w3resource_com.BasicPart_1;

public class Ex58 {

    public static void main(String[] args) {
        /*
        Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:
Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
         */
String sentence = "the quick brown fox jumps over the lazy dog.";

String [] strArr =  sentence.split(" ");
for(int i = 0; i < strArr.length; i++){
String newStrArr = strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
    System.out.print(newStrArr + " ");  //The Quick Brown Fox Jumps Over The Lazy Dog.
     }
        System.out.println();
        for(String eachWord : strArr){
            String newsentence = eachWord.substring(0,1).toUpperCase() + eachWord.substring(1);
            System.out.print(newsentence +  " ");//The Quick Brown Fox Jumps Over The Lazy Dog.
        }
    }
}
