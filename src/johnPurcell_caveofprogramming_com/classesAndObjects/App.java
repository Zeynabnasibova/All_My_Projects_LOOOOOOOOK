package johnPurcell_caveofprogramming_com.classesAndObjects;



class Person {

    //Instance variable (data or "state")
    String name;
    int age;
     //Classes can contain
    //1. Data
    //2. Subroutines (methods)
}

public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Zeynab";
        person1.age = 31;

        Person person2 = new Person();

        person2.name = "Anar";
        person2.age = 37;


        System.out.println(person1.name + " age " + person1.age);

    }


}
