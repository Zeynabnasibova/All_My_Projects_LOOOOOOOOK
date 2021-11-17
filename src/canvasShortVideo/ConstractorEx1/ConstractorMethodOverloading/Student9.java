package canvasShortVideo.ConstractorEx1.ConstractorMethodOverloading;

public class Student9 {

    String name;
    String school;
    int age;
    public Student9(){
        this("NoNone",18);//default value for this object
        System.out.println("no arg Constructor");
    }
    public Student9(String sName, int sAge){
      name = sName;
      age = sAge;

        System.out.println("2 arg Constructor");
    }
}
