package JavaCertification.OCAExamPart3;





class B extends A{
    public B(){
        System.out.println("B");
    }
}
class A{
    public A(){
        System.out.println("A");
    }
}
public class N12C extends  B{
    public N12C(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        N12C c = new N12C();

    }
}
