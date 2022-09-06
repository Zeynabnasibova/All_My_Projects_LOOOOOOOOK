package interviewAll.april2022;


import java.util.InputMismatchException;

public class ConvertStringToInteger {

    /*
    write a program that can convert a string to integer. DO NOT use parse or valueOf methods
     */

    public static void main(String[] args) {
        String str = "123l";
//        int number1 = Integer.parseInt(str);
//        int number2 = Integer.valueOf(str);
//        System.out.println(number1);
//        System.out.println(number2);
        System.out.println(convertToInteger(str));

    }
    public static int convertToInteger(String str){
        int result = 0;
        int factorTo10 = 1;
        try{
            for(int i = str.length()-1;str.startsWith("-") ? i > 0 : i >= 0; i -- ){
                char each = str.charAt(i);
                result += (each - '0') * factorTo10;
                factorTo10 *= 10;
            }
        }catch(InputMismatchException e){
            return 0;
        }
        return result;
    }
}