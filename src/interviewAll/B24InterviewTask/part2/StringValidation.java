package interviewAll.B24InterviewTask.part2;

public class StringValidation {
    /*
    Q7:String -- Password Validation Task 1: Write a return method that can verify if a password is valid or not.
Requirements:
 1. Password MUST be at least have 6 characters and should not contain space.
 2. Password should at least contain one upper case letter
 3. Password should at least contain one lowercase letter
 4. Password should at least contain one special characters  } else {
 5. Password should at least contain a digit if all requirements above are met, the method returns true, otherwise returns false
     */

    public static void main(String[] args) {

        System.out.println(isValid("Zey123n2@"));
    }

    public static boolean isValid(String password) {
        // boolean bl = false;

        //String password = "Zeynab_1234";

        int digit = 0;
        int special = 0;
        int upCount = 0;
        int loCount = 0;
        int countCaracter = 0;
        // String password = "Zeynab123";


        for (int i = 0; i < password.length(); i++) {

            if (password.length() >= 6 && !password.contains(" ")) {
                countCaracter++;

            }
            if (Character.isUpperCase(password.charAt(i))) {
                upCount++;

            }
            if (Character.isLowerCase(password.charAt(i))) {
                loCount++;

            }
            if (Character.isDigit(password.charAt(i))) {
                digit++;

            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                special++;
            }

        }
        if (special >= 1 && loCount >= 1 && upCount >= 1 && digit >= 1 && countCaracter >= 1) {
            //System.out.println(" Password is good:");
            return true;
        } else {
            return false;

        }
    }
}