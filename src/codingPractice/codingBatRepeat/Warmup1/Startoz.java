package codingPractice.codingBatRepeat.Warmup1;

public class Startoz {

    public static void main(String[] args) {

Startoz obj = new Startoz();

String str = "bzoo";

        System.out.println(obj.startOz(str));


    }
    public String startOz(String str) {

        if(str.length() == 0){

            return "";

        }else if(str.length() == 1 && str.charAt(0) == 'o'){
            return "o";

        } else if(str.startsWith("o") && !str.substring(1,2).startsWith("z")){

            return "o";

        }else if(str.substring(1,2).startsWith("z") && !str.startsWith("o")){

            return "z";

        }else if(str.startsWith("oz")){

            return "oz";

        }else{

            return "";
        }
    }



}
