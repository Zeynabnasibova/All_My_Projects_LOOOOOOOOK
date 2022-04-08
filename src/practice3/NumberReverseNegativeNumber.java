package practice3;

public class NumberReverseNegativeNumber {
    public static void main(String[] args) {
        int num = -123;
        System.out.println(reverseAll(num));
    }

    public static int reverseAll(int number){//int number = 12;  -> 1
        int reverse = 0;//2
        while(number != 0){
            int remainder = number % 10;// 12 % 10 = 2 - > 1 % 10 = 1
            reverse = reverse * 10 + remainder; // 0 * 10 + 2 = 2  -> 2 * 10 + 1 =21
            number = number / 10;//12 / 10 = 1 -> 1 / 10 = 0
        }
        return reverse;
    }

}
