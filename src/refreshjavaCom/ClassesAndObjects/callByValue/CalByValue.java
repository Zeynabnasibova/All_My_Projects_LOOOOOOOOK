package refreshjavaCom.ClassesAndObjects.callByValue;

class CallByValue {
    static int a = 20;
    public static void main(String [] args) {
        int b = 30;
        System.out.println("Before method call, a = "+a+ ", b = "+b);//Before method call, a = 20, b = 30
        changeValues(a,b);//In changeValues method, a = 20, p = 40, q = 50
        System.out.println("After method call, a = "+a+ ", b = "+b);//After method call, a = 20, b = 30
    }
    public static void changeValues(int p, int q) {
        p = 40;
        q = 50;
//        a = 70;
        System.out.println("In changeValues method, a = " +a+ ", p = "+p+", q = "+q);
    }
}