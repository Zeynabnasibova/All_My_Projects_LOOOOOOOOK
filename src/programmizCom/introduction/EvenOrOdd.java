package programmizCom.introduction;

public class EvenOrOdd {
    public static void main(String[] args) {

        int num = 5;

        if (num % 2 == 0) {

            System.out.println("number is even");

        } else {

            System.out.println("number is odd");
        }

        int number = 5;

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        System.out.println(evenOrOdd);

    }

}

