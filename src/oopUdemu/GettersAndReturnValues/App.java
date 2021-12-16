package oopUdemu.GettersAndReturnValues;


class Person {
    String name;
    int age;
void speak () {

    System.out.println("My name is: " + name);
}
int calculateYearsToRetirement () {

    int yearsLeft = 65 - age;

    return yearsLeft;

    }

}


public class App {
    public static void main(String[] args) {

        Person person1 = new Person();



    }
}
