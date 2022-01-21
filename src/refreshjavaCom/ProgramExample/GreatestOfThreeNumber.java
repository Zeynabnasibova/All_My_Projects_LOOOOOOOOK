package refreshjavaCom.ProgramExample;

class GreatestOfThreeNumber
{
    public static void main(String [] args) {
        int num1 = 40, num2 = 20, num3 = 50;
if(num1 > num2 && num1 > num3){

    System.out.println(num1 + " is greater number");
}else if(num2 > num1 && num2 > num3){
    System.out.println(num2 + " is greater number");
}else{

    System.out.println(num3 + " is greater number");
}
    }
}