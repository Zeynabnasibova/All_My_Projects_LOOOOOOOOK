package refreshjavaCom.ControlFlowStatements;
class NestedWhileLoop
{
    public static void main(String [] args)
    {
        int i=0,j=0;
        while(i<3) {
            j=0;
            while(j<3) {
                System.out.print(i+""+j+ "  ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}