package codingPractice.codingBatRepeat.Warmup1;

public class StartHi {

    public static void main(String[] args) {

        StartHi obj = new StartHi();

        String str = "hi there";

        System.out.println(obj.startHi(str));

    }

    public boolean startHi(String str) {

        if(str.startsWith("hi")){

            return true;

        }else{

            return false;
        }
    }
}
