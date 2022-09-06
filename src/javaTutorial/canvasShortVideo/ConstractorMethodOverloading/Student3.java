package javaTutorial.canvasShortVideo.ConstractorMethodOverloading;
public class Student3 {

    String name;          //instance variable
    String school;      //instance variable
    int age;          //instance variable

 //this 3 instance variable will be defined the State of that Student
    public Student3(){
        System.out.println("no argument Constructor");
    }
    public static void main(String[] args) {

        Student3 st1 = new Student3();// empty student obj with an empty state

        st1.name = "Zeynab";  //now this student has state
        st1.school = "CyberTek";//now this student has state
        st1.age = 18;//now this student has state

        //State of object it is defines by instance variable

    }

}
