package javaTutorial.javaFlowControl;

public class JavaIf_elseStatement {

    public static void main(String[] args) {


        /**
         The if-else statement is the most basic of all the control flow statements. It tells the program to execute a certain block of code only if a particular test evaluates to true.

         1. If-else statement – Syntax

         The format of an if-else statement is :
         **/
         /*


         if (condition){

         statement-1

         }else{

         statement-2


         }

         */
        /**
         The condition must be a boolean expression. That is, it must evaluate to true or false. If the condition evaluates to true, statement-1 is executed. Otherwise, statement-2 is executed.

         2. else block is optional

         The else part is optional. We may write a statement as :

         if (condition){

         statement-1
         }

         */

        /**
         *
         3. Java if-else statement example

         Let’s see an example of if-else statement in Java.

         If-else example
         */


        boolean condition = true;

        if (condition) {

            System.out.println("Condition is true");//Condition is true

        } else {

            System.out.println("Condition is false");
        }

/**
 4. Nested if-else statement example

 The if-else statements can be nested as well. They will be executed based on condition associated with them.

 */

        int i = 10;

        if (i > 10) {

            System.out.println("Condition is greater than 10");

        } else if (i < 10) {

            System.out.println("Condition is less than 10"); //Condition is equal to 10
        } else {

            System.out.println("Condition is equal to 10");

        }


        /**
         5. Curly braces is needed if there are two or more statements to execute

         Consider below program:

         Compile time error
         int num1, num2, num3 = 10;

         if (num1 > 40)
         num2 = num2 + 10;
         num3 = num3 + 10;
         else
         num2 = num2 - 10;
         num3 = num3 - 10;


         Above program will not compile. What’s wrong with above program? Answer is that we can place only one statement between if and else, in any if-else statement.

         Here, we want to execute two statements when num1 is greater than 50. In this case, you need to bundle two statements into one block statement using curly braces, like so:
         */

        /**

         6. Use ternary operator to replace simple if-else statement

         We can also use the ternary operator in place of simple if-else statement. It can be used as java if-else short-hand.

         For example,
         Example 1
         // Use of an if-else statement
         if (num1 < num2)
         calc(num1);
         else
         calc(num2);

         // Use of a ternary operator
         calc(num1 < num2 ? num1 : num2)
         Similar example could be for a case where you want to print the message “k is 15” if the value of an int variable k is equal to 15. Otherwise, you want to print the message “k is not 15”.

         Example 2
         System.out.println(k == 15 ? "k is 15" : "k is not 15");

         */


    }
}
