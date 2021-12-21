package johnPurcell_caveofprogramming_com.interfaces;

public class Person implements Info,IStartable{
    public String name;


    public Person(String name){

        this.name = name;

    }

    public void greet(){
        System.out.println("Hello there.");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " +name);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
