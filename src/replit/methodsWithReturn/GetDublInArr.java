package replit.methodsWithReturn;

public class GetDublInArr {

    public static void main(String[] args) {


        String[] strArr = {"1","2","aa","1", "aa"};

        int countFind =0;
        for (int i = 0; i < strArr.length; i++){

            int uniqueCount = 0;

            for(int j = 0; j < strArr.length; j++){

                if(strArr[i].equalsIgnoreCase(strArr[j])){

                    uniqueCount++;

                }

            }

            if(uniqueCount >= 2){

            countFind++;
               // System.out.println(strArr[i]);
            }
        }
        System.out.println(countFind);
    }
}