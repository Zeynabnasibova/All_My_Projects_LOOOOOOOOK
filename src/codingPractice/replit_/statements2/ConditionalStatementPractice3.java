package codingPractice.replit_.statements2;

import java.util.Scanner;

public class ConditionalStatementPractice3 {

    public static void main(String[] args) {
        /*
        The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher

input: Faa
output: student
         */

        Scanner input = new Scanner(System.in);
        String name = input.next();

        if(name.equals("Chen")){

            System.out.println("teacher");
        }else{
            System.out.println("student");
        }



    }
}
