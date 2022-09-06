package javaTutorial.oopyoutubeVladlenVojayev.ex2N12;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your age");
        int age = scan.nextInt();


        Human child = new Human(age,name);
        String childName = child.name;
        System.out.println(childName + ", age: " +age);

        Human man = new Human(10,"Anar");
        Human woman = new Human(23,"Zeyneb");
        System.out.println(man.name);
        System.out.println(woman.name + " - " +  woman.age);

        man.sayHello(woman.name);
        woman.sayHello(man.name);


    }
}
