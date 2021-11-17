package oopyoutube.ex11Object;

public class ToStringMethod {

    public static void main(String[] args) {
//Method toString()
        Person man = new Person("Anar");
        System.out.println(man.toString());

        //Method hashCode()

        System.out.println(man.hashCode());

        System.out.println(man.getClass());
        System.out.println(man.name.equals("Anar"));

    }
}

class Person {

    String name;

    Person(String inputName ){
        this.name = inputName;

    }

    @Override
    public String toString(){

        return "Person " + name;
    }

    @Override
    public int hashCode(){
        return 2 * name.hashCode() + 5;
    }


}