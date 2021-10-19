package codingBatWithMethod.string_1;

public class HelloNameWithoutStatic {



    public String helloName(String name) {

        name = "Hello ".concat(name) + "!" ;

        return name;


    }


    public static void main(String[] args) {

      HelloNameWithoutStatic name = new HelloNameWithoutStatic();

        System.out.println(name.helloName("Zeynab"));


       // System.out.println(name.helloName("Leyla"));


        HelloNameWithoutStatic name2 = new HelloNameWithoutStatic();

        System.out.println(name2.helloName("Leyla"));


    }

}
