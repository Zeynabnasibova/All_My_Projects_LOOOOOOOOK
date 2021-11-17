package saimDayByDay.day45_Constructors;

public class UsingStudent {


    public static void main(String[] args) {

        Student studentOne = new Student();

        studentOne.name = "Zeynab";
        studentOne.batchNumber = 24;
        studentOne.grade = 10.00;


        System.out.println(studentOne.toString()); // we try to call toString, but we don't need to
        System.out.println(studentOne); // toString is still called

    }
}