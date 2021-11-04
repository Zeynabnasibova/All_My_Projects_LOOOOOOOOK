package replit.method;
import java.util.Scanner;
public class Signum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(sign(number));

    }



    public static String sign(int num){


        if(num > 0){
            return "positive";
        }else if(num < 0){

            return "negative";
        }else {
            return "zero";
        }
    }

}
/*
Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.

for example :

sign(5)  => positive

sign(-30) => negative

sign(0)  => zero
 */