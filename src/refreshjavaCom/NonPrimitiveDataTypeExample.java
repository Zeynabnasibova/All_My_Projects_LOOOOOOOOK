package refreshjavaCom;

class NonPrimitiveDataTypeExample {
    public static void main(String[] args) {
        // String is a non primitive data type define in Java
        String nonPrimStr = "String is a non primitive data type";
        System.out.println("nonPrimStr = "+ nonPrimStr);
        // Integer is a non primitive data type define in Java
        Integer intVal = new Integer(10);
        System.out.println("intVal = "+ intVal);
        // This class itself is a non primitive data type
        NonPrimitiveDataTypeExample np = new NonPrimitiveDataTypeExample();
        System.out.println("np = "+ np.toString());
    }
}