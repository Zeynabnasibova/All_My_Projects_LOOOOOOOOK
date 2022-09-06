package javaTutorial.javaFlowControl;

public class JavaForLoop {
    public static void main(String[] args) {



        /**

         The for loop statement provides a compact way to iterate over a range of values. Programmers often refer to it as the “for loop” because of the way it repeatedly loops until a particular condition is satisfied.

         1. for loop syntax

         The general form of the for statement can be expressed as follows:

         for (initialization; termination; increment)
         {
         statement(s);
         }
         The initialization expression initializes the loop; it’s executed once, as the loop begins.
         When the termination expression evaluates to false, the loop terminates.
         The increment expression is invoked after each iteration through the loop; it is perfectly acceptable for this expression to increment or decrement a value.
         */

/*

2. for loop example

For example, the following for-loop statement will print all integers between 1 and 6, inclusive:
 */

        for(int num = 1; num <= 6; num++) {


            System.out.println(num);
            //Console
            //1
            //2
            //3
            //4
            //5
            //6

/**
 The execution of for loop flows like this-

 First, 'int num = 1' is executed, which declares an integer variable num and initializes it to 1.
 Then, condition-expression (num <= 6) is evaluated, which is 1 <= 6. It evaluates to true for the first time. Now, the statement associated with the for-loop statement is executed, which prints the current value of num.
 Finally num++ is executed, which increments the value of num by 1. At this point, the value of num becomes 2.
 The condition-expression 2 <= 6 is evaluated, which returns true, and again current value of num is printed.
 This process continues until the value of num becomes 6 and it is printed.
 After that, num++ sets the value of num to 7, and the expression 7 <= 6 returns false, which stops the execution of the for-loop statement.

 */

/*
3. initialization and increment are optional parts

Please note that initialization and increment are optional parts, can be controlled from other places. But termination condition is mandatory for a finite loop. If you do not mention termination condition, then it will be an infinite for loop.
 */


            int num1 = 1;        //initialization

            for( ; num1 <= 6 ; ) {

                System.out.println(num1);

                num1++;         //increment
            }

            //Console
            //1
            //2
            //3
            //4
            //5
            //6
        }

    }
}
