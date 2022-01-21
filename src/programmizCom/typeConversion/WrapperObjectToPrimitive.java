package programmizCom.typeConversion;

public class WrapperObjectToPrimitive {


    public static void main(String[] args) {


        Integer obj = Integer.valueOf(980);

        int num = obj.intValue();
        System.out.println(num);
    }
}
