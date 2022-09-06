package javaTutorial.refreshjavaCom.ProgramExample;
class MethodCallByObject {
    public static void main(String [] args) {
        /* creating object obj of class MethodCallByObject */
        MethodCallByObject obj = new MethodCallByObject();
        /* calling firstMethod using object obj */
        obj.firstMethod();
        System.out.println("first");
    }
    void firstMethod() {
        System.out.println("second");
        System.out.println("third");
    }
}