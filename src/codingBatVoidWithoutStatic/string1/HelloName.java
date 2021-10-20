package codingBatVoidWithoutStatic.string1;

public class HelloName {


    public static void main(String[] args) {

      HelloName obj = new HelloName();

      obj.helloName("Zeynab");

    }








    public void helloName(String name) {//in here our metod void dont have return

        name = "Hello ".concat(name) + "!" ;

        System.out.println(name);

    }

}
