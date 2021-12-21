package muhtar.gitJavaFundamentals.Blocks_Constrctor.Constructors;
class A1{

    A1(){
        System.out.println("Hello");
    }

}

class B1 extends A1{

    B1(){

        // default constructor in parent class is already called in child class by default
        System.out.println("Hola");
    }

}

public class Practices2 {

    public static void main(String[] args) {
        B1 obj1=new B1();   // hello, hola



    }

}