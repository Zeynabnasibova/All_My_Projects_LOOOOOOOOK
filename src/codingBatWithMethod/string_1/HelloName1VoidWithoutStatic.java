package codingBatWithMethod.string_1;

public class HelloName1VoidWithoutStatic {




    public void helloName(String name) {

        name = "Hello ".concat(name) + "!" ;

        System.out.println(name);


    }


    public static void main(String[] args) {


        HelloName1VoidWithoutStatic name = new HelloName1VoidWithoutStatic();

        name.helloName("Zeynab");

    }


}
