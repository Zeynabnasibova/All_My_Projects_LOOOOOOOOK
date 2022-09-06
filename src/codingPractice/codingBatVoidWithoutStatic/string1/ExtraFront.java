package codingPractice.codingBatVoidWithoutStatic.string1;

public class ExtraFront {

    public static void main(String[] args) {

      ExtraFront obj = new ExtraFront();

              obj.extraFront("hello");


    }






    public void extraFront(String str) {

        if (str.length() > 1) {

            str = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);

            System.out.println(str);

        }else{

            str = str + str + str;

            System.out.println(str);

        }
    }

}
