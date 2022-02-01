package refreshjavaCom.ClassesAndObjects.staticKeyword;



class Student {
    static int total = 50;
    static String collegeName = "SUMVS";

    public static void printDetail() {
        System.out.println("total students = "+ total);
        System.out.println("college name = "+ collegeName);
    }
}



class StaticMethodDemo {
    int count = 20;
    static String test = "Learning static method";

    static void testMethod() {
        // count = count+2; // Static method can't access non-static variables
        int num = 30;
        System.out.println(test+ ", num = "+num);
    }

    public static void main(String [] args) {
        StaticMethodDemo.testMethod();
        testMethod(); // Can access testMethod directly as well.
        Student.printDetail(); // Calling printDetail method of Student class
        // printDetail() // Can't access other class static method directly.
    }

}