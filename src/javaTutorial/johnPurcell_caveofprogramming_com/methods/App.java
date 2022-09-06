package javaTutorial.johnPurcell_caveofprogramming_com.methods;

class Person {

    //Instance variable (data or "state")
    String name;
    int age;
    //Classes can contain
    //1. Data
    //2. Subroutines (methods)

    void speak () { //behaviour //subroutine //method

        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello(){ // behavior-->Object can do something
        System.out.println("Hello there!");


    }

}


public class App {

    public static void main(String[] args) {

        //Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Zeynab";
        person1.age = 31;
        person1.speak();
        person1.sayHello();

        //Create a second Person object using the Person class
        Person person2 = new Person();
        person2.name = "Anar";
        person2.age = 37;
        person2.speak();
        person2.sayHello();


        System.out.println(person1.name + " age " + person1.age);

    }

}
