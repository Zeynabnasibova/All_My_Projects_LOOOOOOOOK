package canvasShortVideo.ConstractorMethodOverloading;
public class Student5 {
   String name;
   String school;
   int age;

   public Student5(String sName, int sAge){

       name = sName;
       age = sAge;
       System.out.println("2 arg Constructor");
   }
    public static void main(String[] args) {

       //Student with name and age defined
       Student5 st5 = new Student5("Zeynab", 30);

        System.out.println("name: " + st5.name + "\n " + "age: " + st5.age);

    }
}
