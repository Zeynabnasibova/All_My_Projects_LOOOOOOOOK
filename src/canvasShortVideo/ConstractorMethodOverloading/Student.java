package canvasShortVideo.ConstractorMethodOverloading;
public class Student {
    public Student(){ // Constructor method that take no argument
        System.out.println("" +
"Lets call constructor.How call? \n" +
"You can call constructor inside the same class(where are you constructor)\n or create new class and call constructor inside the new class\n" +
"Create main method" +
"Create object->CreateConstructor obj = new CreateConstructor();\n" +
"Creating object it  will calling Constructor ");
    }
    public static void main(String[] args) {
        Student obj = new Student();
    }

public Student(String sName){//Constructor method take one argument

}


}
