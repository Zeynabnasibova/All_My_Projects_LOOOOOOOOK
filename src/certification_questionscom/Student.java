package certification_questionscom;

public class Student {
public  static String subject;
static void displaySubject(){
    System.out.println("Subject " + subject);
}


}
class Main{
    public static void main(String[] args) {
        Student.subject = "Java";
        Student.displaySubject();
    }
}
