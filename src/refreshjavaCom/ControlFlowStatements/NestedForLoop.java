package refreshjavaCom.ControlFlowStatements;

class NestedForLoop
{
    public static void main(String [] args)
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Outer loop iteration i =  "+i);
            for(int j=1;j<=3;j++)
            {
                System.out.println("j =  "+j);
            }
        }
    }
}