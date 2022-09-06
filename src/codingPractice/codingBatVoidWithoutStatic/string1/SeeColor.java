package codingPractice.codingBatVoidWithoutStatic.string1;

public class SeeColor {
    public static void main(String[] args) {

        SeeColor obj = new SeeColor();

        obj.seeColor("redxx");

    }





    public void seeColor(String str) {

        if(str.startsWith("red") && str.length() >= 3){
            str = str.substring(0,3);
            System.out.println(str);
        }else if(str.startsWith("blue") && str.length() >= 4){
            str = str.substring(0,4);
            System.out.println(str);
        }else{
            System.out.println(str);
        }
    }

}
