package leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution5 obj = new Solution5();
        String strs [] =  new String [] {"flower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
class Solution5 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for(int i = 0; i < strs.length; i++){
            for(int j = i + 1; j < strs.length; j++){
                if(strs[i] == strs[j]){
                    prefix += strs[i];
                }
            }
        }
        return prefix;
    }
}
