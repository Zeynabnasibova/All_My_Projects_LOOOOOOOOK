package codingPractice.programmizCom.typeConversion;

public class DoubleToInt {
    public static void main(String[] args) {
        double d = 8798.9;
        int num = (int)d;
        System.out.println(num);


        Double obj = 989.9;
        int num1 = obj.intValue();
        System.out.println(num1);
    }
}
