package practiceAllInterviewCodingTasksSaim;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    /*
    * [IQ] Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.

https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

Ex: {([])} -> balanced
    {[(])} -> not balanced
HackerRank
Balanced Brackets | HackerRank
Given a string containing three types of brackets, determine if it is balanced.

     */

    public boolean isBalanced(String str){

        Map<Character,Character> map = new HashMap<>();
        map.put('{', '{');
        map.put('(', ')');
        map.put('[', ']');
        //Stack - a collection type. Implements "List" interface, extends vector class
        //Stack - The stack is a linear data structure that is used to store the collection of objects. It is based on Last in First Out
        Stack<Character> stack = new Stack<>();
        /*
        {([])}
        charAt 1 --> (
                 stack:
                     [
                     (
                     {
          */
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                if(stack.isEmpty() || str.charAt(i) != stack.pop()){ // ] != [
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }
}
