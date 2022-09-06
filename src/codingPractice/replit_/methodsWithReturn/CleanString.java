package codingPractice.replit_.methodsWithReturn;

public class CleanString {

    public static String cleanString(String text , String badWord){

        String newWord = "";

        if(text.contains(badWord)){

            newWord = text.replace(badWord ," ");

        }
        return newWord.trim();
    }


}
/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")

returns "one three"

clean ("foo bar","foo")

returns "bar"

clean ("he said bla bla bla","bla")

returns "he said"
 */