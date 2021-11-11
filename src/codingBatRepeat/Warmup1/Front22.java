package codingBatRepeat.Warmup1;

public class Front22 {


    public static void main(String[] args) {

 Front22 obj = new Front22();

 String str = "Ha";

        System.out.println(obj.front22(str));

    }

    public String front22(String str) {

        if(str.length() >= 3){

            str = str.substring(0,2) + str + str.substring(0,2) ;
            return str;

        }else{

            str = str + str + str;

            return str;
        }


    }


}
