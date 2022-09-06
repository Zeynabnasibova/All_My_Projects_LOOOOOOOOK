package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q7 {

    public static void main(String[] args) {


        /*
Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
         */

        int a = 55;
        int b = 70;


        if(a < 50 && a < b ){

            System.out.println(true);

        }else{

            System.out.println(false);
        }
    }
}
