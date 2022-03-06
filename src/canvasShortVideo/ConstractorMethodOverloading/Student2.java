package canvasShortVideo.ConstractorMethodOverloading;
public class Student2 {
    String name;
    String school;
    int age;

    public Student2(){
        System.out.println("no arg Constructor");
    }

    public Student2(String sName){//Constructor with 1 arguments

        System.out.println("1 arg Constructor");

    }
    public static void main(String[] args) {
        Student2 obj1 = new Student2("Zeynab");
        Student2 obj2 = new Student2("Movlud");
        Student2 obj3 = new Student2();


      //  Student obj3 = new Student2();//if created an obj with
        // no arg constructor for this class it was not compiled
    }
}
