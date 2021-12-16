package practice2;

public class NumbersArmstrongNumbers{
    public static void main(String[] args) {


        System.out.println(arnmstrongNum(153));
    }

    public static boolean arnmstrongNum (int num ){//153

        int orig = num;//153

        int sumofCubs = 0;

        while (num != 0){

            int remainder = num % 10;

            sumofCubs = sumofCubs + remainder * remainder * remainder;

            num = num / 10;
        }
        if(sumofCubs == orig){

            return  true;

        }else{

            return  false;
        }
    }

}
