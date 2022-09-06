package codingPractice.codingBatRepeat.Logic2;

public class LuckySum {


    public static void main(String[] args) {

LuckySum obj = new LuckySum();

int a = 8;
int b = 8;
int c = 56;

        System.out.println(obj.luckySum(a, b, c));

    }

    public int luckySum(int a, int b, int c) {

        if(a == 13 ){

            return 0;

        }else if(b == 13){

            return a;

        }else if(c == 13){

            return a + b;

        }else{

            return a + b + c;
        }

    }


}
