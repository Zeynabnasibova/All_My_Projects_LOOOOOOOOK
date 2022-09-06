package javaTutorial.arrayInJava;

import java.util.Arrays;

public class JoinStringArray {

    public static void main(String[] args) {

        String str = "how-to-do-in-java. provides-java-tutorials.";

        String[] strArray = str.split("-|\\.");

        System.out.println(Arrays.toString(strArray));


    }
}