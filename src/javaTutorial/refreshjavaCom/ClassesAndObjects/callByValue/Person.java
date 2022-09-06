package javaTutorial.refreshjavaCom.ClassesAndObjects.callByValue;
class Person {
    int age;
    int height;

    public Person(int a, int h) {
        age = a;
        height = h;
    }
    public static void main(String [] args) {
        Person p = new Person(20,170);
        System.out.println("Before method call, age = "+p.age+ ", height = "+p.height);//Before method call, age = 20, height = 170
        changeValues(p);//In changeValues method, age = 30, height = 180
        System.out.println("After method call, age = "+p.age+ ", height = "+p.height);//After method call, age = 30, height = 180
    }
    public static void changeValues(Person q) {
        q.age = 30;
        q.height = 180;
        System.out.println("In changeValues method, age = "+q.age+ ", height = "+q.height);
    }
}