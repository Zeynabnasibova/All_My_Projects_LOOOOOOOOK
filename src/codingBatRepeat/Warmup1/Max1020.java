package codingBatRepeat.Warmup1;

public class Max1020 {

    public static void main(String[] args) {

 Max1020 obj = new Max1020();

 int a = 9;
 int b = 21;

        System.out.println(obj.max1020(a,b));

    }

    public int max1020(int a, int b) {

        if(b>a){
            return b;

        }else if(  a>b ){
            return a;
        }else{
            return 0;
        }
    }

}
