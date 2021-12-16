package practice2;

public class NumbersDivideWithoutDivOperator {

    public static void division(int a, int b ){

        int count = 0;

        if(b == 0 ){

            System.out.println("not divisible by 0");
        }else{
//                         2 < 0
            for(int i = 0; i < a; i ++ ){

                a = a -b;// 8 - 4 = 4 ; 4 - 4 = 0

                count++;

            }
        }
        System.out.println("result = " + count + " remainder = "+ a);
    }

    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        division(a,b);
    }

}
