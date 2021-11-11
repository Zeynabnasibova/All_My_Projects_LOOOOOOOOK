package codingBatRepeat.Warmup1;

public class SumDouble {


    public static void main(String[] args) {

 SumDouble obj = new SumDouble();
        int a = 2;
        int b = 3;

        System.out.println(obj.sumDouble(a,b));


    }
    public int sumDouble(int a, int b) {

        if(a == b){

            return (a+b)*2;

        }else{

            return (a+b);
        }

    }


}
