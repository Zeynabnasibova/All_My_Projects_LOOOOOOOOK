package SaimPdf.unit5ProblemSet.polymorphismPrctice;


class Aclass{

    public void method1() {
        System.out.print("Zeynab ");
    }
    public void mm1() {
        System.out.println("hello");
    }


        }

class Bclass extends  Aclass{
    public void method1() {
        System.out.print("Mahir ");
    }
    public void mm2() { System.out.println("Good morning");
    }

}
class Cclass extends Bclass{

    public void method1() {  System.out.print("Zehra ");
    }
    public void mm3() { System.out.println("hi");
    }

}



public class PolimorphismClass {
    public static void main(String[] args) {
        Aclass obj1 =new Aclass();
        obj1.method1();   // Zeynab
        obj1.mm1();
        System.out.println();

        Aclass obj2=new Bclass();
        obj2.method1();  // Mahir:   if method is exist in both parent and child class, the override one will return.
        obj2.mm1();

        Aclass obj3=new Cclass();
        obj3.method1();  // Zehra
        obj3.mm1();	    // hello
        //	  obj3.mm3();	 //reference type decides what methods and variables can be called and cannot be called.
        // in order to call the method, it has to exist in reference class.

        Bclass obj4=new Bclass();

        obj4.mm2();
        // obj4.mm1();

        Bclass obj5=new Cclass();



    }

}