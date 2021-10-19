package B24InterviewTask.Part2;

public class SumOfDigitsInAString1 {

    /*Q8:String -- sum of digits in a string: Write a method that can return the sum of the digits in a string.*/

    public static void main(String[] args) {

        System.out.println("Sum of digit numbers is: " + sum("123rt4"));
    }

    public static int sum(String str) {

        //String str = "123rt4";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) { // check each index digit or not.if digit ->wrapper class metod

                System.out.println("Digitits in the string: " + ch);

                int numStr = Integer.parseInt(String.valueOf(ch));//conver String to int. return wrapper class obj

               // int numStr = Integer.parseInt(""+ch);

                sum += numStr; //take each
            }
        }
        //System.out.println("Sum of digit numbers is: " + sum);
        return sum;

    }

}