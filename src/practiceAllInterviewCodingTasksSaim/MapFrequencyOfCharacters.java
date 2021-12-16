package practiceAllInterviewCodingTasksSaim;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyOfCharacters {
    /*
Write a method that prints the frequency of each character from a String
 */

    /* Create a method that will accept a String and print out the frequency of every character in the String (Use maps, format doesn't need to match the output exactly)

            Ex:
            Input: "apple"
            Output: a = 1
            p = 2
            l = 1
            e = 1
*/

    public void frequencyOfChar(String str){

        Map<Character,Integer> map = new HashMap<>();
// { a - 1 }
        for(int i = 0; i < str.length(); i ++){

            char letter = str.charAt(i);

            if(map.containsKey(letter)){
             //counter by getting the current value of the letter key, it takes that value and adds 1, then it stores as the value back into the map with the same key - letter
                int currentCount = map.get(letter);
                map.put(letter,currentCount + 1);

            }else{
                //will run anytime we check a new character that isn't in our map yet
                map.put(letter, 1);

            }

        }
        System.out.println(map);
    }

    public static void main(String[] args) {

        MapFrequencyOfCharacters obj = new MapFrequencyOfCharacters();

        String str = "apple";
        obj.frequencyOfChar(str);

    }

}
