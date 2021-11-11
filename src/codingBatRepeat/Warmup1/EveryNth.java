package codingBatRepeat.Warmup1;

public class EveryNth {

    public static void main(String[] args) {

        EveryNth obj = new EveryNth();

        String str = "He";

        int n = 2;

        System.out.println(obj.everyNth(str, n));

    }

    public String everyNth(String str, int n) {

        String newStr = ""; // 2

        for(int i = 0; i < str.length(); i += n){

            newStr += str.charAt(i);

        }

        return newStr;
    }


}
