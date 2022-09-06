package codingPractice.leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        System.out.println(obj.isPalindrome(123));
    }

}
class Solution2 {
    public boolean isPalindrome(int x) {
        //  123
        int reverse = 0;//3
        if(x < 0){
            return false;
        }
        int number = x;
        while(x > 0){
            int remainder = x % 10;//123 % 10 = 3 //12 % 10 = 2
            reverse = reverse * 10 + remainder; // 0 + 3=3// 3*10+2 = 32
            x = x / 10; // 123 / 10 = 12 //12/10 = 1
        }
        if(reverse == number){

            return true;
        }  else{
            return false;
        }
    }
}