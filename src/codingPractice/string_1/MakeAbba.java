package codingPractice.string_1;

public class MakeAbba {

    /*
    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi","Bye"));
    }



    public static String makeAbba(String a, String b) {

        String newStr = a + b + b + a;

        return  newStr;


    }


}
