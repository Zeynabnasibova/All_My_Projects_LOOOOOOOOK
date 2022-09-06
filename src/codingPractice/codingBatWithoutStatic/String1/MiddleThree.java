package codingPractice.codingBatWithoutStatic.String1;

public class MiddleThree {

    public static void main(String[] args) {


        MiddleThree obj = new MiddleThree();

        System.out.println(obj.middleThree("Candy"));
    }





    public String middleThree(String str) {

        str  = str.substring(str.length()/2-1,str.length()/2+1) + str.substring(str.length()/2+1,str.length()/2+2);

        return str;
    }

}
