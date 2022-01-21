package refreshjavaCom.String;

class StringClassMethods
{
    public static void main(String [] args)
    {
        String s1 = "refresh java";
        String s2 = "Hello World";
        String s3 = "learn java on refresh java tutorial";
        String str;

        // Getting the length of a string
        System.out.println("length of string s1 = "+s1.length());
        // Comparing two strings
        System.out.println(s1.equals("refresh java"));
        System.out.println("is s1 equals s2 = "+s1.equals(s2));
        // Checking if a string starts with a given substring
        System.out.println("is s1 starts with word refresh = "+s1.startsWith("refresh"));
        // Searching a substring in a string
        System.out.println("index of word java in s3 = "+s3.indexOf("java"));
        System.out.println("index of word hello in s3 = "+s3.indexOf("hello"));
        // Getting the character at given index in a string
        System.out.println("character at index 8 in string s1 = "+s1.charAt(8));
        // Extracting a substring from a given string
        str = s1.substring(8);
        System.out.println("Substring str = "+str);
        // After extracting a substring, value of s1 will still remain same.
        System.out.println("Value of s1 = "+s1);
        // Converting a given string to lower case.
        str = s2.toLowerCase();
        System.out.println("Lower case str = "+str);
        // Concatenating a string to given string.
        str = s1.concat(" tutorial");
        System.out.println("Concatenated str = "+str);
        // Concatenating a string to given string using + operator.
        str = str + " online";
        System.out.println("+ operated value of str = "+str);
        // Replacing a word in a given string.
        str = s3.replaceFirst("java","program");
        System.out.println("Replaced value str = "+str);
        // Splitting a given string using space( ).
        String[] strArray = s3.split(" ");
        for(String strVar : strArray)
            System.out.print(strVar+", ");



    }
}