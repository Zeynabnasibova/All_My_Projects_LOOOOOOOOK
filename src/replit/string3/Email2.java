package replit.string3;

public class Email2 {

    public static void main(String[] args) {

/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com

Output:
First name: Craig
Last name: Federighi
Domain: apple
 */

        String email = "craig_federighi@apple.com";

        String name = email.substring(0,email.indexOf("_"));
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1));

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

        System.out.println(lastName.substring(0,1).toUpperCase() + lastName.substring(1));

        String domain = email.substring(email.indexOf("@") +1,email.indexOf("."));

        System.out.println(domain);
    }
}
