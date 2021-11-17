package saimDayByDay.day48_Static;

public class CydeoStudent {


    String name;
    int id;
    int groupNumber;

    static Coffee myCoffee;

    static int batchNumber;
    static String [] instructors;
    static String schoolName;

    public CydeoStudent(String name, int id, int groupNumber){
        this.name = name;
        this.id = id;
        this.groupNumber = groupNumber;
    }

    static {
        batchNumber = 24;
        instructors = new String[]{"Nadir", "Saim", "Murodil"};
        schoolName = "Cydeo";
        myCoffee = new Coffee("Starbucks", 10);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}