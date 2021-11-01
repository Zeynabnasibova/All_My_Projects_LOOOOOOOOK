package SaimJavaInterviewCodingTasks;

public class StringPasswordValidationTask {

    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;



        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }



}
/*
1. Write a return method that can verify if a password is valid or not.

requirements:

 1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit



if all requirements above are met, the method returns true, otherwise returns  false


 */