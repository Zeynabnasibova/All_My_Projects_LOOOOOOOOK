package programmizCom.typeConversion;

public class LongObjToInt {
    public static void main(String[] args) {

        Long obj = Long.valueOf(34);

        int num = obj.intValue();
        System.out.println(num);
    }
}
