package codingPractice.replit_.string3;
import java.util.Scanner;
public class Alejandro {

    public static void main(String[] args ){

        /*
Alejandro has many emails and only has time to read the emails that refer to him. Check if his name is found in the email and if it does print "read", but if his name is not in the email print "don't read"

Examples:

a = "dear alejandro.....alot of text"

output: "read"

a = "thunder blaz is the best drink in the galaxy..."

output: "don't read"

a = "subject : important project, alejandro we refer to you  this ...."

output: "read"
         */

        Scanner input = new Scanner(System.in);

        String email = input.nextLine();

        String name = "Alejandro";

        if(email.contains("Alejandro")){

            System.out.println("read");

        }else{

            System.out.println("don't read");
        }


    }
}
