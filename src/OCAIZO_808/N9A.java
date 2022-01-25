package OCAIZO_808;

class C {
    public C(){
        System.out.println("C ");
    }
}
class B extends C{
    public B(){
        System.out.println("B ");
    }
}

public class N9A extends B{
    public N9A(){
        System.out.println("A ");
    }

    public static void main(String []args){
        N9A a = new N9A();
    }

}

