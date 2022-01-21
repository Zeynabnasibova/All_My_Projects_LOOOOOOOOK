package refreshjavaCom.JavaArrays;

class ArrayInJava
{
    public static void main(String [] args)
    {
        int[] marks = new int[5];
        marks[0] = 40;
        marks[1] = 60;
        marks[2] = 80;
        marks[3] = 65;
        marks[4] = 70;

        System.out.println("Element at index 0 = "+marks[0]);
        System.out.println("Element at index 1 = "+marks[1]);
        System.out.println("Element at index 2 = "+marks[2]);
        System.out.println("Element at index 3 = "+marks[3]);
        System.out.println("Element at index 4 = "+marks[4]);

        // Accessing array elements using for loop;
        System.out.println("Accessing array element using for loop ........");
        for(int i=0; i<5; i++)
        {
            System.out.println("Element at index "+i+" = "+marks[i]);
        }
    }
}