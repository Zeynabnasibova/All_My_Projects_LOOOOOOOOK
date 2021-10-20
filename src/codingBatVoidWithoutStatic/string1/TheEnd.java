package codingBatVoidWithoutStatic.string1;

public class TheEnd {

    public static void main(String[] args) {


        TheEnd obj = new TheEnd();

        obj.theEnd("Hello",true);


    }





    public void theEnd(String str, boolean front) {


        if (front) {

            System.out.println(str.substring(0, 1));

        } else {

            System.out.println(str.substring(str.length() - 1));
        }

    }

}