package javaTutorial.refreshjavaCom;
class PrimitiveDataTypeExample {
    public static void main(String[] args) {
        byte byteVar = 123;
        short shortVar = 1234;
        int intVar = 123456;
        long longVar = 3124567891L; // Must end with l or L
        float floatVar = 123.45f; // Must end with f or F
        double doubleVar = 12345.6789d; // d or D is optional
        double doubleVar2 = 125.67;
        boolean booleanVar = true;
        char charVar = 65; // code for A
        char charVar2 = 'C';

        // Some incorrect declaration
        // long longVar2 = 34287; Must end with l or L
        // float floatVar2 = 123.45; Must end with f or F

        System.out.println("byteVar = "+ byteVar);
        System.out.println("shortVar = "+ shortVar);
        System.out.println("intVar = "+ intVar);
        System.out.println("longVar = "+ longVar);
        System.out.println("floatVar = "+ floatVar);
        System.out.println("doubleVar = "+ doubleVar);
        System.out.println("doubleVar2 = "+ doubleVar2);
        System.out.println("booleanVar = "+ booleanVar);
        System.out.println("charVar = "+ charVar);
        System.out.println("charVar2 = "+ charVar2);
    }
}