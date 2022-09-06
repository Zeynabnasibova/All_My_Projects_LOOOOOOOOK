package codingPractice.codingBatWithoutStatic.String1;

public class HelloName {


    public static void main(String[] args) {

        HelloName obj = new HelloName();// we created in here class object

       // obj.helloName("Zeyneb");
                                        //argument
        System.out.println(obj.helloName("Zeyneb"));


    }





                           //parameter
    public String helloName(String name) { // method return

        name = "Hello ".concat(name) + "!" ;

        return name;


    }

}
