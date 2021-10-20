package codingBatWithoutStatic.String1;

public class ExtraFront {


    public static void main(String[] args) {


        ExtraFront obj = new ExtraFront();

        System.out.println(obj.extraFront("Hello"));
    }




    public String extraFront(String str) {

        if (str.length() > 1) {

            str = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);

            return str;

        }else{

            str = str + str + str;

            return str;

        }
    }

}
