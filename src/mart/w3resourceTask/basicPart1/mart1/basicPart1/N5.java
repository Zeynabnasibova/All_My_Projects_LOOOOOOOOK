package mart.w3resourceTask.basicPart1.mart1.basicPart1;

public class N5 {
    /*

    31. Write a Java program to check whether Java is installed on your computer. Go to the editor
Expected Output
Java Version: 1.8.0_71
Java Runtime Version: 1.8.0_71-b15
Java Home: /opt/jdk/jdk1.8.0_71/jre
Java Vendor: Oracle Corporation
Java Vendor URL: http://Java.oracle.com/
Java Class Path: .
     */

    public static void main(String[] args) {

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.class.path"));
    }
}