package javaTutorial.muhtar.gitJavaFundamentals.OOP.Abstraction;

public interface Interface2 {
    static int yy=700;
    int rr=900;

//String hh;   instance variables in interface by default are final, therefore they must have to be initilized.

    public void mm();
    abstract public void xx();

    public static void main(String[] arr) {}

}
class erpan implements Interface2{
    public static void main(String[] args) {
        System.out.println(yy);
        //	yy=1000;   // instance variables in interface by default are final.

        Interface2 obj = new erpan();
        // when interface is reference we can only give REGULAR implements class for object type.
    }

    public void xx() {}
    public void mm() {}

}
abstract class yashar implements Interface2{

    // it has two invisible abstract methods.
}

class shehla extends yashar implements Interface2  {  // if implement and extends has to come together, extends must come first.
    public void xx() {}
    public void mm() {}
    //

}

interface ooo{  }

class muradil implements ooo,Interface2{    // class can extend only one class but can implement multiple interfaces.
    public void xx() {}
    public void mm() {}
}
// class extends class only, and interface extends interface only.
// when class and interface come together the class can only implement the interface.
// interface cannot implement anything
// if implement and extends has to come together, extends must come first.
//class can extend only one class but can implement multiple interfaces.
