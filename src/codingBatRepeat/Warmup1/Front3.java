package codingBatRepeat.Warmup1;

public class Front3 {

    public static void main(String[] args) {
 Front3 obj = new Front3();
String str = "abc";
        System.out.println(obj.front3(str));

    }

    public String front3(String str) {

        if(str.length() >= 4){

            str = str.substring(0,3) +  str.substring(0,3) +  str.substring(0,3) ;

            return str;

        }else {

            str = str.substring(0) + str.substring(0)  + str.substring(0) ;

            return str;
        }

    }


}
