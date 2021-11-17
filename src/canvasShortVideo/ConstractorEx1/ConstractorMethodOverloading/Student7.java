package canvasShortVideo.ConstractorEx1.ConstractorMethodOverloading;

public class Student7 {
    String name;
    String school;
    int age;

    public Student7(){
        System.out.println("no arg Constructor");
    }
    public Student7(String name, int age){
        this(); //this() keyword is used to call
        // other constructor in same class(public Student7(){}  )

        System.out.println("2 arg Constructor");
    }

    public static void main(String[] args) {
        Student7 st7 = new Student7();
    }
}
