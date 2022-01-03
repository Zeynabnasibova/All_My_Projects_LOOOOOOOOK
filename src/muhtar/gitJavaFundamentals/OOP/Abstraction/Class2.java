package muhtar.gitJavaFundamentals.OOP.Abstraction;
abstract class rr{
    static int uu;
    static int u=900;
    int w=100;
    final int oo=450;
    abstract public void ss();
    rr(){  }
    public String xx() { return "hell"; }

    public static void main(String[] arr) {  }

    public void xxx() { }
}

abstract class zz extends rr{

    // abstract public void ss();   this method is still here invisible.
    rr obj= new Class2();
// when abstract class is reference we can only give regular child class for the object type

}


public class Class2 extends rr{


    public static void main(String[] args) {
        u=400;
        rr obj=new Class2();
        obj.w=600;
        //	obj.oo=500;

    }

    public void ss() {}




}