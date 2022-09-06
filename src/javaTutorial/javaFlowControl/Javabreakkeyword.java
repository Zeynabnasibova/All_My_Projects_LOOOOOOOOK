package javaTutorial.javaFlowControl;

public class Javabreakkeyword {

    public static void main(String[] args) {

        /**
         *
         * The Java break keyword is used to terminate for, while, or do-while loop. It may also be used to terminate a switch statement as well.
         *
         * Using break keyword is also called break statement.
         */


        /**
         * 1. Java break keyword syntax
         *
         * Syntax is pretty much simple. Use break keyword with a semicolon (;). You can additionally use a label as well.
         * for(...){
         *
         *     //loop statements
         *
         *     break;
         * }
         */


        /**
         * 2. Types of break statement
         *
         * A break statement is used to exit from a block. There are two forms of the break Statements:
         *
         * Unlabeled break statement
         * Labeled break statement
         * 2.1. Unlabeled break statement
         *
         * Unlabeled break statement are without any labels. They are written as simply "break;". An example of unlabeled break statement can be:
         */



        int i = 1;

        while (true) {   // Cannot exit the loop from here

            if (i <= 10) {

                System.out.println(i);

                i++;

            } else {

                break; // Exit the loop

            }
        }


        /**
         *2.2. Labeled break statement
         *
         * Here, you write a label name after break statement. An example of a labeled break statement is :
         *
         * break label;
         * A more detailed example could be:
         *
         */System.out.println();


        blockLabel:{

            int i1 = 10;

            if (i1 == 5) {

                break blockLabel;   // Exits the block

            }if (i1 == 10) {

                System.out.println("i1 is not five");

            }
        }

        /**
         *3. break keyword example
         *
         * Java program to print the numbers from 1 to 5 and then break the loop.
         *
         */System.out.println();

        int i3 = 1;

        while (true) {

            if(i3 > 5)

                break;

            System.out.println(i3);

            i3++;
        }




    }

    }

