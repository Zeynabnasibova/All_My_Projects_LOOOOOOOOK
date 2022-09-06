package codingPractice.codingBatRepeat.Warmup1;

public class DelDel {


    public static void main(String[] args) {

        DelDel obj = new DelDel();

        String str = "abc";

        System.out.println(obj.delDel(str));
    }

    public String delDel(String str) {

        if(str.length() >= 4  && str.substring(1).startsWith("del") ){

            str = str.replace("del","");

            return str;

        }else{

            return str;
        }
    }

}
