package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

import java.util.Scanner;

public class Ex1 {
    /**
     1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
     Expected Output :
     Hello
     Alexandra Abramov
     */
    public static void main(String[] args) {

        Ex1 obj = new Ex1();

        obj.printName();

    }

    public  void printName(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstName = input.nextLine();
        System.out.println("Enter your lastname");
        String lastName = input.nextLine();
        System.out.println("Hello \n" + firstName + " " + lastName);


    }
}
