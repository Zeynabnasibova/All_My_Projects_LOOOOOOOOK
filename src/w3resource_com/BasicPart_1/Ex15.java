package w3resource_com.BasicPart_1;

public class Ex15 {
    /*
    15. Write a Java program to swap two variables.
     */
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 8;
        int numTemp = num1;
        num1 = num2;
        num2 = numTemp;

        System.out.println("num1 is:" + num1);
        System.out.println("num2 is : " + num2);

        int first = 4;
        int second = 5;
        second = first + second;//9
        first = second - first;// 9 - 4 = 5
        second = second - first;//9 - 5 = 4

        System.out.println("first num is: " + first);
        System.out.println("second num is: " + second);

    }
}
