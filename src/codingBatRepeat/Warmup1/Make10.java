package codingBatRepeat.Warmup1;

public class Make10 {


    public static void main(String[] args) {

        Make10 obj = new Make10();

        int a = 10;
        int b = 2;

        System.out.println(obj.makes10(a,b));

    }

    public boolean makes10(int a, int b) {


        if(a == 10 || b == 10 || a+b== 10){
            return true;
        }else{
            return false;
        }
    }
}
