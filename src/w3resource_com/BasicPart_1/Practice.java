package w3resource_com.BasicPart_1;

public class Practice {
    public static void main(String[] args) {
int num1 = 10;
int num2 = 20;
int num3 = 3;
if( num1 > num2 && num1 > num3 && num2 > num3){
    System.out.println("num2 is middle");
}else if (num2 > num1 && num2 > num3 && num3 > num1){
    System.out.println("num3 is middle");
}else if(num3 > num1 && num3 > num2 && num1 > num2){
    System.out.println("num1 is middle");
}else if(num3 > num1 && num3 > num2 && num2 > num1){
    System.out.println("num2 is middle");
}
    }
}
