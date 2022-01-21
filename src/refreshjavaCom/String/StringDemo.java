package refreshjavaCom.String;

class	StringDemo
{
    public static void main(String args[])
    {
        // Creating String variables
        String strVar = "refresh java";
        String strVar2 = new String("Hello World");
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String strVar3 = new String(charArray);
        String strVar4 = strVar;
        // Printing the values of String variables
        System.out.println("strVar = "+strVar);
        System.out.println("strVar2 = "+strVar2);
        System.out.println("strVar3 = "+strVar3);
        System.out.println("strVar4 = "+strVar4);
    }
}
