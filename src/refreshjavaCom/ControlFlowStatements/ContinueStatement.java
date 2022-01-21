package refreshjavaCom.ControlFlowStatements;
class ContinueStatement
{
    public static void main(String [] args)
    {
        for(int i=1; i<=5; i++)
        {
            if(i==4)
            {
                continue;
            }
            System.out.println("i = "+i);
        }
        System.out.println("line after for loop");
    }
}
