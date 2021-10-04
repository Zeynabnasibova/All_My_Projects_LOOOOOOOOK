package javaFlowControl;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class JavaFlowControlStatements {

    public static void main(String[] args) {

        /**
         *Java application code is normally executed sequentially from top to bottom in the order that the code appears. To apply business logic, we may need to execute code on conditional basis. Control flow statements helps in this conditional execution of code blocks.
         *
         * All control flow statements are associated with a business condition – when true, the code block executes; when false it is skipped.
         *
         * Java supports following control statements.
         *
         */

/**
 * 1. If-else Statement
 *
 * If-else statement tells the program to execute a certain section of code only if a particular test evaluates to true otherwise else block is executed.
 *
 * We can have nested if-else blocks.
 */    System.out.println();

        boolean condition = true;

        if (condition) {

            System.out.println("Condition is true");// true

        } else {

            System.out.println("Condition is false");
        }


        /**
         *2. Switch Statement
         *
         * As if-else statement tells your program to execute a certain section of code only if a particular test evaluates to true or false, the switch statement can have multiple execution paths.
         *
         * A switch works with the byte, short, char, and int primitive data types. It also works with enumerated types, the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer. (enums were added in java 5, and String class was added in java 7).
         *
         *
         */   System.out.println();



        String value = "B";

        switch (value) {

            case "A":

                System.out.println("Value is A");

                break;

            case "B":

                System.out.println("Value is B"); //Value is B

                break;

            default:

                System.out.println("Value is neither A nor B");

                break;
        }



            /**
             * 3. While Loop
             *
             * The while statement or loop continually executes a block of statements while a particular condition is true. The while statement continues testing the expression and executing its block until the expression evaluates to false.
             */System.out.println();


        int i = 1;

        while (i < 5) {

            System.out.println("Count is: " + i);     // 1
                                                      // 2
                                                      // 3
                                                      // 4


            i++;
        }



        /**
         * 4. Do-while Loop
         *
         * The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once.
         *
         * Note that the do-while statement ends with a semicolon. The condition-expression must be a boolean expression.
         */System.out.println();


        int i1 = 1;

        int sum = 0;


        do {

            sum = sum + i1;

            i1++;

        } while (i1 <= 10);

        System.out.println(sum); // 55

/**
 * 5. For Loop
 *
 * The for statement iterates over a range of values. It repeatedly loops over values until a particular condition is satisfied.
 */System.out.println();


        for(int i2 = 1; i2 <= 5; i2++) {

            System.out.println(i2); // 1
                                    // 2
                                    // 3
                                   // 4
                                   // 5

        }
/**
 *6. Enhanced For-each Loop
 *
 * Java 5 introduced an foreach loop, which is called a enhanced for-each loop. It is used for iterating over elements of arrays and collections.
 *
 */System.out.println();

        int[] numList = {10, 20, 30, 40};

        for(int eachNum : numList){

            System.out.println(eachNum);   // 10
                                           // 20
                                           //30
                                           //40

        }

        /**
         * 7. Labeled Statement
         *
         * Whenever during a program execution, a labeled break statement is encountered that control immediately goes out of enclosing labeled block. Similarly, labeled continue will bring control back to start. Just like in normal break and continue statements, with additional names given to blocks.
         */System.out.println();


        loop: for(int i3=0; i3 < 6; i3++) {

            if(i3 % 2 == 0) {

                System.out.println("In if block :: " + i3);

                continue loop;
            } else {

                System.out.println("In else block :: " + i3);
            }
        }

    }
}