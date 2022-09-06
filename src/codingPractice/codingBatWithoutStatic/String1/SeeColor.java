package codingPractice.codingBatWithoutStatic.String1;

public class SeeColor {

    public static void main(String[] args) {



        SeeColor obj = new SeeColor();

        System.out.println(obj.seeColor("redxx"));
    }


    public String seeColor(String str) {

        if(str.startsWith("red") && str.length() >= 3){
            str = str.substring(0,3);
            return str;
        }else if(str.startsWith("blue") && str.length() >= 4){
            str = str.substring(0,4);
            return str;
        }else{
            return "";
        }
    }

}
