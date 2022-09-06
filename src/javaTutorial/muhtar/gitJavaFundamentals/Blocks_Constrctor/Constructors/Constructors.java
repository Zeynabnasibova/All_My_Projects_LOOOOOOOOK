package javaTutorial.muhtar.gitJavaFundamentals.Blocks_Constrctor.Constructors;

class Animal1{
    int z=10;
    Animal1(int z){
        //	this();    // in order to call local class' constructor we need this keyword.
        z=100;
    }

    public Animal1() {        // default constructor

        this(18);
        int z=90;
        System.out.println("Animals");
        this.z=20;
        // this. key word is needed in order to call instance when there are same local and instance variable names.
        z=50;
    }

}

class Cat extends Animal1{

    public Cat(int age) {
        //	super();   // in order to call constructor methods from parent class we use super keyword.
        //	super(17);   one constructor method can only call one constructor
        System.out.println("Cats "+ age);

        mm();
        super.z=100;   // in order to call instance variable from parent class we use super.
    }
    public void mm() {
        //	this(10);  constructor method can only be called in another constructor method.

    }

}
public class Constructors {
    public static void main(String[] args) {
        Animal1 obj1=new Animal1();
        //    Cat obj2=new Cat();
//			if we created constructor method that is not default, means there is no default constructor

        Cat obj3=new Cat(8);


    }


}