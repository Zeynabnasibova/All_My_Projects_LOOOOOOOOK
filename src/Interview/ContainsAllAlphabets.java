package Interview;

public class ContainsAllAlphabets {

    public static void main(String[] args) {
        System.out.println( checkAllChars( "qwertyuioplkjhgfdsAzxcvbnm" ) );
        System.out.println( checkAllChars( "123" ) );
        System.out.println( checkAllChars( "ejuxggfsts" ) );
        System.out.println( checkAllChars( "wyyga" ) );
    }

    private static String checkAllChars ( String input ) {
        //If input length is less than 26 then it can never be complete
        if(input.length() < 26) {
            return "FALSE";
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0) {
                return "FALSE";
            }
        }
        return "TRUE";
    }
}
