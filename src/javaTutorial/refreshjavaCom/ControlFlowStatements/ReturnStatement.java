package javaTutorial.refreshjavaCom.ControlFlowStatements;

class ReturnStatement
{
    public static void main(String [] args)
    {
        int sum = sum(10,20);
        System.out.println("Sum = "+sum);
    }
    public static int sum(int a, int b)
    {
        return a+b;
    }
}