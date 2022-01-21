package refreshjavaCom.JavaArrays;

class ForEachLoop
{
    public static void main(String [] args)
    {
        int[] marks = new int[]{40,60,80,65,70};
        System.out.println("Accessing array element using normal for loop ........");
        for(int i =0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Accessing array element using for-each loop ........");
        for(int num : marks)
        {
            System.out.println(num);
        }
    }
}
