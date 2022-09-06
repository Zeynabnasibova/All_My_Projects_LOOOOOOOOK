package interviewAll.beknazarsuranchiyev;

public class BalancedString {
    /**
     17.1 Balanced String. This question became very popular lately. The program should find out if an input string is balanced or not.
     */
    /**
     * Check for balanced parentheses in an expression
     */
   /* Algorithm
1. store each character of s into stack <char> letters
2. check if letters.top() == "[{(<" (open bracket) - if yes - int open++;
3. check if letters.top() == "]})>" (closed bracket) - if yes int close++;
4. letters.pop();
5. if letters.empty() { if (open == close) { return true; }
    else return false;
*/
    public static boolean isValid(String str) {

        if (str == null || str.length() == 0) {
            return true;
        }

        int count = 0;
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                if (count == 0)
                    return false;
                else
                    count--;
            }
            i++;
        }

        if(count != 0)
            return false;

        return true;
    }

    public static void main(String[] args) {
        String str = "((BCD)AE)";
        System.out.println("isValid: " + isValid(str));
        str = ")(PH)N(X)";
        System.out.println("isValid: " + isValid(str));
    }
}
