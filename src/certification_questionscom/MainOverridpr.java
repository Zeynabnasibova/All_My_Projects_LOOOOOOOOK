package certification_questionscom;

public class MainOverridpr {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}
class Animal {
    public void makeSound(){

        System.out.println("Making animal sound");
    }
}
class Dog extends Animal{
        public void makeSound(){
            super.makeSound();
            System.out.println("Woof woof");

        }
}
