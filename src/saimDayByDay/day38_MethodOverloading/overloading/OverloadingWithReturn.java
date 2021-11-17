package saimDayByDay.day38_MethodOverloading.overloading;

public class OverloadingWithReturn {

    public static void method(){

        System.out.println("void method - no params");

    }


    public static int method(int a){

        System.out.println("int method - int params");

        return 0;

    }

    public static String method(String s){

        System.out.println("String method - String params");

        return "";

    }






}
