package saimDayByDay.day49_Encapsualtion;

public class Car {

    Driver driver; // reference

    public Car(String name, String licenseNumber, int age){
        driver = new Driver(name, licenseNumber, age); // create a new Driver object
    }


}


/*
    String driver; // name, licnum, age
    String engine; // cylinder, horesepower
 */

// separate class in the same file

class Driver{

    String name;
    String licenseNumber;
    int age;

    public Driver(String name, String licenseNumber, int age) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }
}