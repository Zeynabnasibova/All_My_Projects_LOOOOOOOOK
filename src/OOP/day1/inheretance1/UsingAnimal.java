package OOP.day1.inheretance1;

public class UsingAnimal {

    public static void main(String[] args) {

        //animal has access to 3 variables
        Animal animal = new Animal();
        animal.age = 10;



        //dog has access to 4 variables

        Dog dog = new Dog();
        dog.age = 10;
        dog.hasTail = true;

        //lion has access to 5 variables and 1 method

        Lion lion = new Lion();
        lion.numberOfClams = 5;
        lion.rear();



    }
}
