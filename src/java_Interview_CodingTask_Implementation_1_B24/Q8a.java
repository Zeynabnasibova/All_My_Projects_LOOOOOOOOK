package java_Interview_CodingTask_Implementation_1_B24;

public class Q8a {

    public static void main(String[] args) {


        String str1 = "dhj34dfhf9fs";

        char[] c = str1.toCharArray();

        int sum = 0;

        for (int i = 0; i < c.length; i++) {

            if (Character.isDigit(c[i])) {

                System.out.print("Digits in the String : " + c[i]);

                System.out.println();

                int a = Integer.parseInt(String.valueOf(c[i]));

                sum = sum + a;
            }
        }

        System.out.println("Sum of Digits is : " + sum);
    }
}
