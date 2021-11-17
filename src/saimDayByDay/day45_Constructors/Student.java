package saimDayByDay.day45_Constructors;

public class Student {


    String name;
    int batchNumber;
    double grade;

    public String toString(){

        String s = "Student information:";

        s += "\nName: " + name;

        s += "\nbatchNumber: " + batchNumber;

        s +=  "\nGrade: " + grade;

        return s;

    }
}
