package codingBatVoidWithoutStatic.string1;

public class MiddleThree {

    public static void main(String[] args) {

        MiddleThree obj = new MiddleThree();

        obj.middleThree("Candy");
    }



    public void middleThree(String str) {

        str  = str.substring(str.length()/2-1,str.length()/2+1) + str.substring(str.length()/2+1,str.length()/2+2);

        System.out.println(str);
    }

}
