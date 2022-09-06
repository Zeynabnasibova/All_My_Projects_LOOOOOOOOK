package javaTutorial.javaFlowControl;

public class JavaDoWhileLoop {

    public static void main(String[] args) {


        /**
         *
         * The Java do-while loop executes a block of statements, and then checks a boolean condition to decide whether to repeat the execution of block statements again or not, repeatedly.
         *
         * 1. Java do-while loop
         *
         * The general form of a do-while statement is :
         *
         * do
         * {
         *     statement(s)
         * } while (condition-expression);
         *
         *
         * The do-while statement ends with a semicolon.
         * The condition-expression must be a boolean expression.
         * The statement can be a simple statement or a block statement.
         * The statement is executed first then the condition-expression is evaluated.
         * If it evaluates to true, the statement is executed again.
         * This loop continues until the condition-expression evaluates to false.
         * Like in a for loop and a while loop, a break statement may be used to exit a do-while loop.
         */

        /**
         * 2. Java do-while loop example
         *
         * An example usage of do-while loop can be as follows. It prints the numbers from 1 to 5.
         */
        int i = 1;

        do {

            System.out.println(i); // 1
                                   // 2
                                   // 3
                                   // 4
                                   // 5

            i++;

        } while (i <= 5);

        /**
         * 3. while loop vs do-while loop
         *
         * The difference between do-while loop and while-loop is that do-while evaluates its expression at the bottom of the loop instead of the top. Therefore, the statements within the do block are always executed at least once.
         *
         * Other than this there is no difference between both loops.
         */

    }
}
