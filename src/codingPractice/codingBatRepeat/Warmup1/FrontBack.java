package codingPractice.codingBatRepeat.Warmup1;

public class FrontBack {

    public static void main(String[] args) {
        FrontBack obj = new FrontBack();

        String str = "code";

        System.out.println(obj.frontBack(str));

    }

    public String frontBack(String str) {
        if(str.length() <= 1){

            return str;
        }else if(str.length() == 2){
            return "" + str.charAt(1) + str.charAt(0);
        }else{

            String newStr = str.substring(str.length() -1) +
                    str.substring(1,str.length()-1) + str.charAt(0);
            return newStr;
        }
    }
}
