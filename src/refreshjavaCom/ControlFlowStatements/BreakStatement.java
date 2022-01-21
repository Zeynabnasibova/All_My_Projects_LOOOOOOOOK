package refreshjavaCom.ControlFlowStatements;
class BreakStatement
{
    public static void main(String [] args)
    {
        for(int i=1; i<=5; i++)
        {
            if(i==4)
            {
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println("line after for loop");
    }
}
