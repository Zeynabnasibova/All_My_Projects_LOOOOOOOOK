package oracleJavaCertification;

public class N26FieldInit {

Character c;
boolean b;
float f;
void printAll() {
    System.out.println("c = " + c);
    System.out.println("b = " + b);
    System.out.println("f = " + f);
}

public static void main (String [] args){
    N26FieldInit f = new N26FieldInit();
    f.printAll();
}

}
