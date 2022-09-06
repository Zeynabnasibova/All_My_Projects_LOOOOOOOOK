package JavaCertification.certification_questionscom;

public class N9 {

    static int x = 11;

    private int y = 33;

    public static void main(String[] args) {

        N9 pro = new N9();

       pro.method(5);
        System.out.print(N9.x);
        System.out.print(" " + pro.x);
        System.out.print(" " + pro.y);
    }
    public void method(int x){
        x = 10;
        y = 12;
    }
}
