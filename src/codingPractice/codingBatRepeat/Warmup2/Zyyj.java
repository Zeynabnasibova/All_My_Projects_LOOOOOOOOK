package codingPractice.codingBatRepeat.Warmup2;

public class Zyyj {

    public static void main(String[] args) {

        String str = "xHxxxxxix";
        String newStr = str.substring(1,str.length()-1);
        System.out.println(newStr);

        for(int i = 0; i < str.length(); i++){

            if(str.substring(1,str.length()-1).contains("x")){

          str = str.substring(i).replace("x","");

            }

        }

        System.out.println(str);
    }
}
