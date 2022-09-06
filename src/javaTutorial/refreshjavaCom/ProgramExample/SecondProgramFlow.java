package javaTutorial.refreshjavaCom.ProgramExample;

class SecondProgramFlow {
    public static void main(String [] args) {
        // calling firstMethod
        firstMethod();
        System.out.println("main method");
    }
    public static void firstMethod() {
        System.out.println("first method");
        // calling secondMethod and assigning return value in i
        int i = secondMethod();
        System.out.println("After second method call, i = "+i);
    }
    public static int secondMethod() {
        System.out.println("second method");
        return 1;
    }
}