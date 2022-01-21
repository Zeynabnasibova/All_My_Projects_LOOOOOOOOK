package refreshjavaCom.ControlFlowStatements;

class IfStatement
{
    public static void main(String [] args)
    {
        int num1 = 20;
        if(num1 > 0)
        {
            System.out.println("num1 is a positive number");
        }
        if(num1 < 0)
        {
            System.out.println("num1 is a negative number");
        }
        System.out.println("code after if block");
    }
}