package algo;

import java.util.Arrays;
import java.util.HashMap;;
import java.util.Map;

//Find the first non-repeating character in an array.
public class FirstNonRepeatingCharInAnArray {
    public static void main(String[] args) {
        String input = "abc";
        //System.out.println(helper("cbac"));
       helper2(input);
    }

    private static void helper2(String input) {
        final int NO_OF_CHARS = 256;
        final char [] count =  new char[NO_OF_CHARS];
        for (int i=0;i<input.length();i++){
            count[input.charAt(i)]++;
        }
        System.out.println(Arrays.toString(count));
    }

    private static Character helper(final String input) {
        if (input == null || input.length() == 0) throw new IllegalArgumentException("Invalid input passed !");
        if(input.length()==1) return input.charAt(0);
        final Map<Character, Integer> map = new HashMap<>();
        char res = '0';
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1);
            } else {
                map.put(currentChar, map.get(currentChar) + 1);
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == 1) {
                res = input.charAt(i);
                break;
            }
        }
        System.out.println(map);
        return res;
    }

}
