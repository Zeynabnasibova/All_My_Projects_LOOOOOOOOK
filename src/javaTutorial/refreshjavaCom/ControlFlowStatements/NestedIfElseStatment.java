package javaTutorial.refreshjavaCom.ControlFlowStatements;

public class NestedIfElseStatment {
        public static void main(String [] args) {
            int num1 = 20;
            if(num1 >= 10) {
                if(num1<100) {
                    System.out.println("num1 is a double digit number");
                } else {
                    System.out.println("num1 is not a double digit number");
                }
            } else {
                System.out.println("num1 is less than 10");
            }
            System.out.println("code after nested if else block");
        }
    }