package codingPractice.codingBatRepeat.Warmup1;

public class MixStart {

    public static void main(String[] args) {

        MixStart obj = new MixStart();
        String str = "minbax";
        System.out.println(obj.mixStart(str));


    }



    public boolean mixStart(String str) {

        if(str.length() == 0){

            return false;

        } else if( str.substring(1).startsWith("ix") || str.substring(1).startsWith("ix") ){

            return true;

        }else{

            return false;

        }

    }


}
