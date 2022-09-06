package codingPractice.codingBatVoidWithoutStatic.string1;

public class NonStart {

    public static void main(String[] args) {


    NonStart obj = new NonStart();

    obj.nonStart("Hello","There");

    }



    public void nonStart(String a, String b) {

        String concat  = a.substring(1)+b.substring(1);

        System.out.println(concat);
    }
}
