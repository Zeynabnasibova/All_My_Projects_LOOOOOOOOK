package javaTutorial.canvasShortVideo.ConstractorMethodOverloading;
public class Student8 {
    String name;
    String school;
    int age;
    public Student8(){
        System.out.println("no arg Constructor");
    }
    public Student8(String name, int age){
        this(); //this() keyword is used to call
        // other constructor in same class(public Student8(){}  )

        System.out.println("2 arg Constructor");
    }

    public Student8(String name, int age, String school){
        this(name,age);//this(name,age) keyword is used to call
        // other constructor in same class(public Student8(String name, int age){}  )
        this.school = school;
    }
}
