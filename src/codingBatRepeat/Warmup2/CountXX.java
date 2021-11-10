package codingBatRepeat.Warmup2;

public class CountXX {

    public static void main(String[] args) {

CountXX obj = new CountXX();
String str = "xxx";
        System.out.println(obj.countXX(str));

    }


    int countXX(String str) {


        int count = 0;

        for(int i = 0; i < str.length() -1; i++ ){
            if(str.substring(i,i+2).contains("xx")){
                count++;

            }


        }
        return count;

    }

}
