package refreshjavaCom.ProgramExample;

public class SearchNumber {

    public static void main(String[] args) {

        int [] numbers = {40,60,80,65,70};

        int searchNumber = 80;

        int pos = 0;

        boolean isExist = false;

        for(int i = 0; i < numbers.length;i++){

            if(numbers[i]==searchNumber){

                isExist = true;

                pos = i;

            }
        }

        System.out.println();

    }
}
