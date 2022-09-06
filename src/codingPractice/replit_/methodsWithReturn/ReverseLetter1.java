package codingPractice.replit_.methodsWithReturn;

import java.util.Scanner;

public class ReverseLetter1 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here





//we will remove all non letter characters and put in a variable
        String text=str.replaceAll("\\W","");
        //we will create a position variable and use it go thorugh on text variable from end to beginning
        int pos=text.length()-1;
        //sorted string will be store on nexText variable
        String newText="";
        //we will go through the str
        for (int i = 0; i < str.length(); i++) {
            //if our character is a letter, instead of taking it, we will go to text variable, and take the character are pos(pos will be end of text and go down as we take charcters from text one by one)
            if(str.substring(i,i+1).matches("[a-zA-Z]")){
                //System.out.println(str.substring(i,i+1));
                newText+=text.charAt(pos);
                pos--;
            }
            //if the charcter on the str is not a letter, then we will take is as it is
            else newText+=str.charAt(i);
        }//when iteration is done, we will have out new reversed string and return it.
        return newText;
    }
}

