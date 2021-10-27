package replit.String3;

public class Email1 {

    public static void main(String [] args){


        /*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com

input: barakobama@gmail.com

output: barakobama@gmail.com
         */

        String email = "barakobama@gmail.com";
        if(email.contains("_")) {

            String name = email.substring(0, email.indexOf("_"));

            // System.out.println(name);

            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

            // System.out.println(lastName);

            String domain = email.substring(email.indexOf("@"));

            //System.out.println(domain);

            String newEmail = lastName + "_" + name + domain;

            System.out.println(newEmail);

        }else{

            System.out.println(email);
        }

    }
}
