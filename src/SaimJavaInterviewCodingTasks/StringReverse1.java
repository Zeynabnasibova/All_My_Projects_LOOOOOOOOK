package SaimJavaInterviewCodingTasks;

public class StringReverse1 {






    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
}
/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */