package javaTutorial.refreshjavaCom.packagesAndInterfaces;

class PrivateModifier {
    private int count = 10;
    private void printMessage() {
        System.out.println("count = : "+count);
    }
}

class PrivateModifierTest {
    private int num = 20;

    public static void main(String [] args) {
        PrivateModifierTest pmt = new PrivateModifierTest();
        pmt.printDetail();//Private modifier program
        System.out.println("num = "+pmt.num);
        PrivateModifier pm = new PrivateModifier();
        // pm.printMessage(); // compilation error
        // System.out.println(pm.count); // compilation error
    }
    private void printDetail() {
        System.out.println("Private modifier program");
    }
}