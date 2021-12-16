package beknazarsuranchiyev;

public class StringPool {
    /**
     9.String Pool and == operator to compare references in Java. Let’s see an example, what’s output from the below program? Why this output?
     */
    public static void main(String[] args){
        String str = "apple";
        String str1 = "apple";
        String str2 = new String("apple");

        System.out.println(str == str1);//true
        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));//true
    }

  /*
  Output:
  true
  false
  true

  Line 8: 'true' because str and str1 are both pointing to the same object.
  String will reuse same objects in the String Pool. The == operator when
  used with references(objects) compares if they are pointing to the same
  object or not.

  Line 9: 'false' because when we create String with new keyword it will not
  use String Pool and the references are pointing to different objects.

  Line 10: 'true' because equals() method always compares actual value of strings

  */
}
