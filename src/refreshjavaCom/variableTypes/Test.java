package refreshjavaCom.variableTypes;

public class Test {

    String name = "Zeynab";//instance varable
    static int age = 32;//satati,class variable

    public static void main (String args []){

        String adress = "Maitland Crosing Way";//local variable
        System.out.println(adress);

        System.out.println(age);
        System.out.println(Test.age);

        Test obj = new Test();
        System.out.println(age);
        System.out.println(Test.age);
        System.out.println(obj.age);
        System.out.println("name: " + obj.name + ", " + "age: = " + age);
LocalVariable lv = new LocalVariable();

// binary
        int binaryNumber = 0b10010;
// octal
        int octalNumber = 027;

// decimal
        int decNumber = 34;

// hexadecimal
        int hexNumber = 0x2F; // 0x represents hexadecimal
// binary
        int binNumber = 0b10010; // 0b represents binary

        System.out.println(binNumber);
    }
}
