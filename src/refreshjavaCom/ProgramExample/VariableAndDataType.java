package refreshjavaCom.ProgramExample;

class VariableAndDataType
{
    public static void main(String [] args)
    {
        byte a = 20;
        byte b = 10;
        byte sum = (byte)(a+b);
        // char ch = 'abc'; // Can not assign multiple characters
        char ch = 'a';
        // boolean b2 = 'false' , c ="false";  // Can not use '', or ""
        boolean b2 = false;
        System.out.println("sum = " +sum);
        System.out.println("ch = " +ch);
        System.out.println("b2 = "+ b2);
        System.out.println("First line \nSecond line");
        System.out.println("refresh \t java");
        System.out.println("Displaying \" in string.");
    }
}