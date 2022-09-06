package interviewAll.beknazarsuranchiyev;

public class EvenOrOdd {
    /**
     15.Even or Odd. Write a method that will accept one int as an argument. The method will print Even if the number is even and Odd if the number is odd
     */


    public String evenOrOdd(int num){

        if(num % 2 == 0){

            return "even";

        }else{

            return "odd";
        }
    }

    public static void main(String[] args) {

        EvenOrOdd obj = new EvenOrOdd();
        int num = 1;
        System.out.println(obj.evenOrOdd(num));
    }
}
