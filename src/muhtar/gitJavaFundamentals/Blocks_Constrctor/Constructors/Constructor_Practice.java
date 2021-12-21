package muhtar.gitJavaFundamentals.Blocks_Constrctor.Constructors;


class A{

    A(int z){
        System.out.println("Hello "+z);    // hello
    }

}
class B extends A{

    B(double zz){
        super(19);    // hello
        System.out.println("World "+zz);    // world
// if parent class does not have default constructor method but other constructors, then the parent' class constructor has to be called in child class FIRST
    }

}
class C extends B{
    C(){
        super(19); // hello,  world.
        System.out.println(" Cybertek ");
    }

}


public class Constructor_Practice {

    public static void main(String[] args) {

    }

}
