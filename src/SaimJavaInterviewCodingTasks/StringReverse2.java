package SaimJavaInterviewCodingTasks;

public class StringReverse2 {

    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */