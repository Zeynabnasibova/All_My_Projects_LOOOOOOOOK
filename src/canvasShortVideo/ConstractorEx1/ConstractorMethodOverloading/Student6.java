package canvasShortVideo.ConstractorEx1.ConstractorMethodOverloading;
public class Student6 {

    String name = "Mahir";
    String school;
    int age;

    public Student6(String name, int age){

        this.name = name;
        this.age = age;

        System.out.println("2 arg Constructor");

    }

    public static void main(String[] args) {
        Student6 st6 = new Student6("Zeynab",30);
        System.out.println(st6.name + "\n" + st6.age);

    }
}
