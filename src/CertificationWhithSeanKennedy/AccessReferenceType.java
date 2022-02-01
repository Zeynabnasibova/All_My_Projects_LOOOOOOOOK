package CertificationWhithSeanKennedy;

public class AccessReferenceType extends A {
    int fi = 15;

    public static void main(String[] args) {
        AccessReferenceType b = new AccessReferenceType();
        b.fi = 20;
        System.out.println(b.fi);//20
        System.out.println(((A)b).fi);
    }
}
class A{
    final int fi = 10;
}
