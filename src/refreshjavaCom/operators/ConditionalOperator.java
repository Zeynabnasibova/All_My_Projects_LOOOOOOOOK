package refreshjavaCom.operators;

class ConditionalOperator {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 10;

        if(num1 == 3 && num2 == 5)
            System.out.println("num1 = 3 AND num2 = 5");
        if(num1 > 0 && num2 > 1 && num3 >= 10)
            System.out.println("num1 > 0 AND num2 > 1 and num3 >= 10");
        if(num1 == 3 || num2 == 5)
            System.out.println("num1 is 3 OR num2 is 5");
        if((num1 > 0 || num2 > 1) && num3 >10)
            System.out.println("Print me if condition is true");

        int result = num1 < num2 ? num1 : num2;
        String str = num1 == num2 ? "num1 and num2 is equal" : "num1 and num2 is not equal";
        System.out.println("result = "+result);
        System.out.println("str = "+str);
    }
}