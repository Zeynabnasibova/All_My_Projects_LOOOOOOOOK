package refreshjavaCom.variableTypes;

class InstanceVariable {
    String city;
    int age = 20; // instance variable age, created inside class
    String name = "Rahul"; // instance variable name, created inside class
    public static void main(String [] args) {

        InstanceVariable iv = new InstanceVariable();
        System.out.println("Age = " +iv.age);
        System.out.println("Name = " +iv.name);
        System.out.println("City = " + iv.city);
    }
}