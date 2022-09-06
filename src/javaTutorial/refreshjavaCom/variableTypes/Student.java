package javaTutorial.refreshjavaCom.variableTypes;

public class Student {
    static String college = "SUMVS"; // static or class variable college
    int rollNo;  // instance variable rollNo
    String name; // instance variable name

    public static void main(String[] args) {

        Student s1 = new Student(); // local variable s1
        s1.rollNo = 1;
        s1.name = "Ram";


        Student s2 = new Student(); // local variable s2
        s2.rollNo = 2;
        s2.name = "Shyam";

        s1.printDetail();
        s2.printDetail();

        int count = 2; // local variable count
        System.out.println("Total students = "+ count);

    }
    void printDetail() {
        int count2 = 2; // local variable count2
        System.out.println(rollNo +", "+ name+", "+ Student.college+", "+ count2);
   //     System.out.println(college);

    }
}