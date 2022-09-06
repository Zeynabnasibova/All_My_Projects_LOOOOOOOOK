package codingPractice.string_1;

public class HelloName {

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *
     *
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     *
     */

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));


    }


    public static String helloName(String name) {

        name = "Hello ".concat(name) + "!" ;

        return name;


    }

}
