package codingPractice.programmizCom.introduction;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 =3;

        num1 = num1 + num2;//5
        num2 = num1 - num2;// 5- 3 = 2
        num1 = num1 - num2;

        System.out.println("num1 after swaping is: " +  num1 );
        System.out.println("num2 after swaping is: " + num2);

    }
}
