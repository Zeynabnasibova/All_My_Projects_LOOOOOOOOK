package javaTutorial.refreshjavaCom.ControlFlowStatements;

class IfElseStatement
{
    public static void main(String [] args)
    {
        int num1 = 20, num2 = 15;
        if(num1 == num2)
        {
            System.out.println("num1 is equal to num2");
        }
        else
        {
            System.out.println("num1 is not equal to num2");
        }
        System.out.println("code after if else block");
    }
}