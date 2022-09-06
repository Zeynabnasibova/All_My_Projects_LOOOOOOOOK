package codingPractice.codingBatRepeat.Warmup1;

public class EndUp {

    public static void main(String[] args) {

        EndUp obj = new EndUp();

        String str = "Hello";

        System.out.println(obj.endUp(str));


    }

    public String endUp(String str) {

        if(str.length() >= 3){

            String strLast = str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
            return strLast;
        }else{

            return str.toUpperCase();
        }

    }


}
