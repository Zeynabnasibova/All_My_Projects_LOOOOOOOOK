package programmizCom.introduction;

public class StringEmptyOrNull {
    public static void main(String[] args) {

        String str1 = null;
        String str2 = "";
        String str3 = " ";

        System.out.println(isNullEmpty(str1));
        System.out.println(isNullEmpty(str2));
        System.out.println(isNullEmpty(str3));
        //method check if string is null or empty
    }

    public static String isNullEmpty(String str){

        if(str == null){
            return null;
        }else if(str.isEmpty()){
            return "empty";
        }else{
            return "neither nul nor empty";
        }

    }
}
