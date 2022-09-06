package javaTutorial.refreshjavaCom.ControlFlowStatements;
public class IfElseIfStatement
{
    public static void main(String [] args)
    {
        int num1 = 20, num2 = 20;
        if(num1 > num2)
        {
            System.out.println("num1 is greater than num2");
        }
        else if(num1 == num2)
        {
            System.out.println("num1 is equal to num2");
        }
        else
        {
            System.out.println("num1 is less than num2");
        }
        System.out.println("code to be executed after else if ladder");
    }
}