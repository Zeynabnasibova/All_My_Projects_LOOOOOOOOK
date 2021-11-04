package replit.method;

public class SplitPersonInfo {


    public static void main(String[] args) {
        person("name,last name,age");
    }
    public static void person(String personInfo){
        //String personInfo = "name,last name,age";

        String [] personInfoArr = personInfo.split(",");
        //System.out.println(Arrays.toString(personInfoArr));

        String name = personInfoArr[0];
        String lastName = personInfoArr[1];
        String age = personInfoArr[2];


        System.out.println("person name: " + name);
        System.out.println("last name: " + lastName);
        System.out.println("age: " + age);
    }

}
/*
The method person has a string arguement with this format: "name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30

hint: use the split method to split the string to a string array where there is a "," char
 */
