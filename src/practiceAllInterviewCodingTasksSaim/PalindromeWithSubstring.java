package practiceAllInterviewCodingTasksSaim;

public class PalindromeWithSubstring {

    public static void main(String[] args) {


        String str = "mom";

        String reverse = ""+str.substring(str.length()-1) + str.substring(str.length()/2,str.length()/2+1) + str.substring(0,1);
        System.out.println(reverse);

        if(str.equals(reverse)){
            System.out.println("polindrome");
        }else{
            System.out.println("not polindrome");
        }
    }
}
