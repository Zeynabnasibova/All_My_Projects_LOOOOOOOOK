package oracleJavaCertification;

public class N24A {

    public N24A(){
        System.out.println("A ");
    }
}
class B extends N24A{

    public B(){
        System.out.println("B ");
    }
}
class C extends B{
    public  C(){
        System.out.println("C ");
    }
    public static void main(String []  args){
        C c = new C();
    }
}
