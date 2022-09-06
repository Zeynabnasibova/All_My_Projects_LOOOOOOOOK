package codingPractice.replit_.array1;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays023SplitEmail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
//String email = "info@cybertekschool.com"
        String[] emailArr = email.split("@");

        System.out.println(Arrays.toString(emailArr));

        if (email.contains("@@") || !email.contains("@") || emailArr.length > 2) {

            System.out.println("invalid email");

        } else {

                    String info = emailArr[0];

                    System.out.println("Email id: " + info);

                    String domain = emailArr[1];

                    System.out.println("Email domain: " + domain);

        }
    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email

email -> my@fancy@email.com

Output:
invalid email
 */