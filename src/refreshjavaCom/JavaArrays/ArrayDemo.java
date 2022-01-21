package refreshjavaCom.JavaArrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] num = new int[]{1, 2, 3, 4};

        int average = 0;
        int sum = 0;
        for(int i = 0; i < num.length; i++){

            sum += num[i];

        }
        average = sum / num.length;
        System.out.println(sum);
        System.out.println(average);
    }

}
