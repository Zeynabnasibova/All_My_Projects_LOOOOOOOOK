package codingPractice.programmizCom.introduction;

public class LargestNumber {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 4;
        int num3 = 3;

        if(num1 >= num2 && num1 >= num3){

            System.out.println(num1 + " is biggest number");

        }else if(num2 >= num1 && num2 >= num3 ){

            System.out.println(num2 + " is bigges number");
        }else{
            System.out.println(num3 + " is biggest number");
        }
    }
}
