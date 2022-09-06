package javaTutorial.refreshjavaCom.JavaArrays;

class ThreeDArray
{
    public static void main(String [] args)
    {
        int[][][] a = {{{15,20},{30,40}},{{25,50},{60,80}}};

        System.out.println("Element at index 000 = "+a[0][0][0]);
        System.out.println("Element at index 001 = "+a[0][0][1]);
        // Accessing 3D array elements using for loop;
        System.out.println("\nAccessing 3D array elements using for loop ........");
        for(int i=0; i < a.length; i++)
        {
            for(int j=0; j < a[i].length; j++)
            {
                for(int k=0; k < a[i][j].length; k++)
                    System.out.println("Element at index "+i+""+j+""+k+" = "+a[i][j][k]);
            }
        }
    }
}