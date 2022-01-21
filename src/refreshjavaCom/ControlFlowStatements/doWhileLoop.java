package refreshjavaCom.ControlFlowStatements;

class doWhileLoop
{
    public static void main(String [] args)
    {
        int num = 1;
        do
        {
            System.out.println(num);
            num++;
        } while(num<=5);
        System.out.println("After the end of do while loop");
    }
}