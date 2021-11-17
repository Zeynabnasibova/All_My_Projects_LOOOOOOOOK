package saimDayByDay.day44_CustomClassesAndObjects;

public class AllPeople {

    public static void main(String [] args){

        //make Person object

        Person personOne = new Person();

        personOne.name = "Zeyneb";
        personOne.age = 32;
        personOne.hairColor = "brown";
        personOne.sex = 'F';
        personOne.isMarried = true;


        System.out.println(personOne.name);
        System.out.println(personOne.isMarried);

    }

}
