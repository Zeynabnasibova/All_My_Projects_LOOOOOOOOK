package practiceAllInterviewCodingTasksSaim;

public class StringSumOfDigitInAString {
    /*
Write a method that can return the sum of the digits in a string
 */

public static int sumOfDigit(String str){

  int sum = 0;

    for(int i = 0; i < str.length();i++){

        if(Character.isDigit(str.charAt(i))){

            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }


    }
    return sum;


}

    public static void main(String[] args) {
String str = "64hkh";
        System.out.println(sumOfDigit(str));
    }

}
